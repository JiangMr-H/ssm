package com.gree.day02.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IGycsDao {

    @Select("SELECT z.\"id\",z.CPMC,z.JYY,z.JCBM,z.BC,z.JCRQ,z.\"scantime\",\n" +
            "CASE z.\"LB_Id\"\n" +
            "\tWHEN 1 THEN '待检验员审核'\n" +
            "\tWHEN 3 THEN '待质控审核'\n" +
            "\tWHEN 4 THEN '待工艺审核'\n" +
            "\tWHEN 5 THEN '已结单'\n" +
            "\tWHEN 8 THEN '已结单(参数修改)'\n" +
            "\tWHEN 6 THEN '待质控确认修改'\n" +
            "\tWHEN 7 THEN '工艺参数修改，待质控确认'\n" +
            "\tELSE '异常' END AS LB_Id FROM \"ZS_GYCS_1\" z order by \"scantime\" desc")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "CPMC", column = "CPMC"),
            @Result(property = "JYY", column = "JYY"),
            @Result(property = "JCBM", column = "JCBM"),
            @Result(property = "BC", column = "BC"),
            @Result(property = "JCRQ", column = "JCRQ"),
            @Result(property = "scantime", column = "scantime"),
            @Result(property = "LB_Id", column = "LB_Id"),
    })
    List<GYCS> findGycs();

    @Insert("INSERT INTO \"ZS_GYCS_1\" z (CPMC,JYY,JCBM,BC,JCRQ,YL1,YL2,YL3,YL4,YL5,YL6,YL7,SD1,SD2,SD3,SD4,SD5,SD6,SD7,WZ1,WZ2,WZ3,WZ4,WZ5,WZ6,WZ7,WD1,WD2,WD3,WD4,WD5,WD6,WD7,SJ,LQ,BYA,JCSJ,BZ,\"scantime\",\"LB_Id\" )VALUES(\n" +
            "#{CPMC},#{JYY},#{JCBM},#{BC},#{JCRQ},#{YL1},#{YL2},#{YL3},#{YL4},#{YL5},#{YL6},#{YL7},#{SD1},#{SD2},#{SD3},#{SD4},#{SD5},#{SD6},#{SD7},#{WZ1},#{WZ2},#{WZ3},#{WZ4},#{WZ5},#{WZ6},#{WZ7},#{WD1},#{WD2},#{WD3},#{WD4},#{WD5},#{WD6},#{WD7},#{SJ},#{LQ},#{BYA},#{JCSJ},#{BZ},SYSDATE,3\n" +
            ")")
    void gycsAdd(GYCS gycs);

    /**
     * 查询调试员列表
     *
     * @return
     */
    @Select("SELECT z.\"id\",z.CPMC,z.JYY,z.JCBM,z.BC,z.JCRQ,z.\"scantime\",s.JC from \"ZS_GYCS_1\" z\n" +
            "            INNER JOIN \"ZS_GYCS_LB\" s ON z.\"LB_Id\"=s.\"id\" where z.\"LB_Id\"=#{count}  order by z.\"scantime\" DESC")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "CPMC", column = "CPMC"),
            @Result(property = "JYY", column = "JYY"),
            @Result(property = "JCBM", column = "JCBM"),
            @Result(property = "BC", column = "BC"),
            @Result(property = "JCRQ", column = "JCRQ"),
            @Result(property = "JC", column = "JC"),
            @Result(property = "scantime", column = "scantime"),
    })
    List<GYCS> findGycs2(int count);

    @Select("select * from \"ZS_GYCS_1\" where \"id\"=#{scrapId}")
    GYCS findByTJYId(int scrapId);

    /**
     * 录入该进程的第一条信息
     *
     * @param id
     * @param roleName
     * @param roleDesc
     */
    @Insert("INSERT INTO \"ZS_GYCS_Audit\"(\"gycs_id\",\"roleName_ZK\",\"roleDesc_ZK\",\"scantime_ZK\")VALUES(#{id},#{roleName},#{roleDesc},SYSDATE)")
    void insertZK(@Param("id") int id, @Param("roleName") String roleName, @Param("roleDesc") String roleDesc);

    /**
     * 录入质控信息
     *
     * @param id
     * @param roleName
     * @param roleDesc
     */
    @Update("update \"ZS_GYCS_1\" set \"roleDesc_ZK\"=#{roleDesc},\"roleName_ZK\"=#{roleName},\"scantime_ZK\"=SYSDATE where \"id\"= #{id}")
    void updateGycsForZK(@Param("id") int id, @Param("roleName") String roleName, @Param("roleDesc") String roleDesc);

    /**
     * 修改该进程的信息，添加进程信息
     */
    @Update("update \"ZS_GYCS_Audit\" set \"roleName_GY\"=#{roleName},\"roleDesc_GY\"=#{roleDesc},\"scantime_GY\"=SYSDATE where \"gycs_id\"=#{id}")
    void updateByJC_GY(@Param("id") int id, @Param("roleName") String roleName, @Param("roleDesc") String roleDesc) throws Exception;

    /**
     * 录入工艺信息
     *
     * @param id
     * @param roleName
     * @param roleDesc
     */
    @Update("update \"ZS_GYCS_1\" set \"roleDesc_GY\"=#{roleDesc},\"roleName_GY\"=#{roleName},\"scantime_GY\"=SYSDATE where \"id\"= #{id}")
    void updateGycsForGY(@Param("id") int id, @Param("roleName") String roleName, @Param("roleDesc") String roleDesc);

    /**
     * 详情查询
     *
     * @param Id
     * @return
     */
    @Select("SELECT g.* FROM \"ZS_GYCS_1\" g where g.\"id\" = #{Id}")
    GYCS findGycsByGyId(int Id);

   /*
    @Update("update \"ZS_GYCS_Audit\" set \"roleName_ZK\"=#{roleName},\"roleDesc_ZK\"=#{roleDesc},\"scantime_ZK\"=SYSDATE where \"gycs_id\"=#{id}")
    void updateByJC_ZK(@Param("id")int id, @Param("roleName")String roleName, @Param("roleDesc")String roleDesc)throws Exception;*/

    /**
     * 随进程执行修改进程参数
     *
     * @param id    工艺参数ID
     * @param count 流程ID
     */
    @Update("update \"ZS_GYCS_1\"  SET \"LB_Id\"=#{count}  where \"id\"=#{id}")
    void GycsUpdate(@Param("id") int id, @Param("count") int count);

    @Update("update \"ZS_GYCS_1\" set \"YL1\"=#{YL1},\"YL2\"=#{YL2},\"YL3\"=#{YL3},\"YL4\"=#{YL4},\"YL5\"=#{YL5},\"YL6\"=#{YL6},\"YL7\"=#{YL7},\"SD1\"=#{SD1},\"SD2\"=#{SD2},\"SD3\"=#{SD3},\"SD4\"=#{SD4},\"SD5\"=#{SD5},\"SD6\"=#{SD6},\"SD7\"=#{SD7}, \n" +
            "                      \"WZ1\"=#{WZ1},\"WZ2\"=#{WZ2},\"WZ3\"=#{WZ3},\"WZ4\"=#{WZ4},\"WZ5\"=#{WZ5},\"WZ6\"=#{WZ6},\"WZ7\"=#{WZ7},\"WD1\"=#{WD1},\"WD2\"=#{WD2},\"WD3\"=#{WD3},\"WD4\"=#{WD4},\"WD5\"=#{WD5},\"WD6\"=#{WD6},\"WD7\"=#{WD7},\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\"CPMC\"=#{CPMC},\"JYY\"=#{JYY},\"JCBM\"=#{JCBM},\"BC\"=#{BC},\"JCRQ\"=#{JCRQ},\"SJ\"=#{SJ},\"LQ\"=#{LQ},\"BYA\"=#{BYA},\"JCSJ\"=#{JCSJ},\"BZ\"=#{BZ},\"LB_Id\"=6 where \"id\"=#{id}")
    void updateGycsById(@Param("id") int id, @Param("YL1") String YL1, @Param("YL2") String YL2, @Param("YL3") String YL3, @Param("YL4") String YL4, @Param("YL5") String YL5, @Param("YL6") String YL6,
                        @Param("YL7") String YL7, @Param("SD1") String SD1, @Param("SD2") String SD2, @Param("SD3") String SD3, @Param("SD4") String SD4, @Param("SD5") String SD5,
                        @Param("SD6") String SD6, @Param("SD7") String SD7, @Param("WZ1") String WZ1, @Param("WZ2") String WZ2, @Param("WZ3") String WZ3, @Param("WZ4") String WZ4,
                        @Param("WZ5") String WZ5, @Param("WZ6") String WZ6, @Param("WZ7") String WZ7, @Param("WD1") String WD1, @Param("WD2") String WD2, @Param("WD3") String WD3,
                        @Param("WD4") String WD4, @Param("WD5") String WD5, @Param("WD6") String WD6, @Param("WD7") String WD7, @Param("CPMC") String CPMC, @Param("JYY") String JYY,
                        @Param("JCBM") String JCBM, @Param("BC") String BC, @Param("JCRQ") String JCRQ, @Param("SJ") String SJ, @Param("LQ") String LQ,
                        @Param("BYA") String BYA, @Param("JCSJ") String JCSJ, @Param("BZ") String BZ);

    /**
     * 保存修改数据
     * @param id
     * @param zKname
     * @param zKdesc
     */
    @Insert("insert into \"ZS_GYCS_Update\" (\"gycs_id\",\"zKname\",\"zKdesc\",\"scantime\")VALUES(#{id},#{zKname},#{zKdesc},SYSDATE)")
    void saveGycsById(@Param("id") int id, @Param("zKname") String zKname, @Param("zKdesc") String zKdesc);

    //void updateGycs

}
