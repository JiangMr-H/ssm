package com.gree.day02.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IScrapDao {

    @Select("SELECT s.\"id\",s.SCRQ,s.BZ,s.CPBM,s.GZBM,s.CLYS,s.JCBM,co.\"currentProcess\" course from \"scrap\" s \n" +
            "\tINNER JOIN \"course\" co ON s.\"courseId\"=co.\"id\"order by s.\"scantime\" desc")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "SCRQ",column = "SCRQ"),
            @Result(property = "BZ",column = "BZ"),
            @Result(property = "CPBM",column = "CPBM"),
            @Result(property = "GZBM",column = "GZBM"),
            @Result(property = "CLYS",column = "CLYS"),
            @Result(property = "JCBM",column = "JCBM"),
            @Result(property = "course",column = "course")
    })
    List<Scrap> findTSY();

    /*
    录入报废单信息(进入班长审核)
     */
    @Insert("insert into \"scrap\"(SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"remake\",\"scantime\",\"courseId\")values(" +
            "#{SCRQ},#{BZ},#{CPBM},#{GZBM},#{CLYS},#{JCBM},#{GYTS},#{QL},#{HBD},#{HW},#{QW},#{YS},#{SBW},#{SS},#{LSL},#{LBH},#{SJ},#{BX},#{SY},#{DKDL},#{YWB},#{SC},#{DS},#{HS},#{NM},#{MC},#{TJBL},#{SYBL},#{SM},#{SLHJ},#{JK},#{CZG},#{remake},SYSDATE,2)")
    void scrapAdd(Scrap scrap);


    @Select("SELECT \"id\",SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"BZZ\",\"JYY\",\"JSY\",\"ZLYJ\",\"CZYJ\",\"remake\" from \"scrap\" where \"id\"=#{scrapId}")
    Scrap findscrapById(int scrapId);

    /**
     * 查询列表
     * @return
     */
    @Select("SELECT s.\"id\",s.SCRQ,s.BZ,s.CPBM,s.GZBM,s.CLYS,s.JCBM,co.\"currentProcess\" course from \"scrap\" s\n" +
            "            INNER JOIN \"course\" co ON s.\"courseId\"=co.\"id\" where s.\"courseId\"=#{count}  order by s.\"scantime\" DESC")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "SCRQ",column = "SCRQ"),
            @Result(property = "BZ",column = "BZ"),
            @Result(property = "CPBM",column = "CPBM"),
            @Result(property = "GZBM",column = "GZBM"),
            @Result(property = "CLYS",column = "CLYS"),
            @Result(property = "JCBM",column = "JCBM"),
            @Result(property = "course",column = "course")
    })
    List<Scrap> findAll(int count);

    /**
     * 修改状态（待质量技术员审核）
     */
    @Update("update \"scrap\" SET \"courseId\"=3 where \"id\"=#{scarpid}")
    void ScarpUpdateZz(int scarpid);
    /**
     * 修改状态（待接收员确认）
     */
    @Update("update \"scrap\" SET \"courseId\"=4 where \"id\"=#{scarpid}")
    void ScarpUpdateJYy(int scarpid);
    /**
     * 修改状态（质量技术领导审核）
     */
    @Update("update \"scrap\" SET \"courseId\"=5 where \"id\"=#{scarpid}")
    void ScarpUpdateJSY(int scarpid);
    /**
     * 修改状态（厂长审核）
     */
    @Update("update \"scrap\" SET \"courseId\"=6 where \"id\"=#{scarpid}")
    void ScarpUpdateZLJS(int scarpid);
    /**
     * 修改状态（已结单）
     */
    @Update("update \"scrap\" SET \"courseId\"=7 where \"id\"=#{scarpid}")
    void ScarpUpdateCZ(int scarpid);








    /**
     * 录入调试员描述信息
     * @param id
     * @param
     * @param
     */
   /* @Insert("insert into \"ZS_Approval\"(\"scrap_id\",\"RoleName_Bz\",\"RoleDescription_Bz\",\"scantime_Bz\")values(#{id},#{RoleName_Zz},#{RoleDescription_Zz},SYSDATE)")
    void insertTJY(@Param("id") int id,@Param("RoleName_TJY") String RoleName_TJY,@Param("RoleDescription_TJY") String RoleDescription_TJY);*/

    @Insert("insert into \"ZS_Approval\"(\"scrap_id\",\"RoleName_Bz\",\"RoleDescription_Bz\",\"scantime_Bz\")values(#{id},#{RoleName_Zz},#{RoleDescription_Zz},SYSDATE)")
    void insertZz(@Param("id")int id, @Param("RoleName_Zz") String RoleName_Zz, @Param("RoleDescription_Zz")String RoleDescription_Zz);

    @Update("update \"scrap\" set \"BZZ\"=#{RoleName_Zz} where \"id\"=#{id}")
    void UpdateScrapForZz(@Param("id")int id,@Param("RoleName_Zz") String RoleName_Zz);

    @Update("update \"ZS_Approval\" SET \"RoleName_JYY\"=#{RoleName_JYy},\"RoleDescription_JYY\"=#{RoleDescription_JYy},\"scantime_JYY\"=SYSDATE where \"scrap_id\"=#{id}")
    void UpdateJYy(@Param("id")int id, @Param("RoleName_JYy")String RoleName_JYy,@Param("RoleDescription_JYy") String RoleDescription_JYy);

    @Update("update \"scrap\" set \"JYY\"=#{RoleName_JYy} where \"id\"=#{id}")
    void UpdateScrapForJYy(@Param("id")int id,@Param("RoleName_JYy") String RoleName_JYy);

    @Update("update \"ZS_Approval\" SET \"RoleName_JSY\"=#{RoleName_JSY},\"RoleDescription_JSY\"=#{RoleDescription_JSY},\"scantime_JSY\"=SYSDATE where \"scrap_id\"=#{id}")
    void UpdateJSY(@Param("id")int id, @Param("RoleName_JSY")String RoleName_JSY, @Param("RoleDescription_JSY")String RoleDescription_JSY);

    @Update("update \"scrap\" set \"JSY\"=#{RoleName_JSY} where \"id\"=#{id}")
    void UpdateScrapForJSY(@Param("id")int id,@Param("RoleName_JSY") String RoleName_JSY);

    @Update("update \"ZS_Approval\" SET \"RoleName_ZL\"=#{RoleName_ZLJS},\"RoleDescription_ZL\"=#{RoleDescription_ZLJS},\"scantime_ZL\"=SYSDATE where \"scrap_id\"=#{id}")
    void UpdateZLJS(@Param("id")int id, @Param("RoleName_ZLJS")String RoleName_ZLJS, @Param("RoleDescription_ZLJS")String RoleDescription_ZLJS);

    @Update("update \"scrap\" set \"ZLYJ\"=#{RoleDescription_ZLJS} where \"id\"=#{id}")
    void UpdateScrapForZLJS(@Param("id")int id,@Param("RoleDescription_ZLJS") String RoleDescription_ZLJS);

    @Update("update \"ZS_Approval\" SET \"RoleName_CZ\"=#{RoleName_CZ},\"RoleDescription_CZ\"=#{RoleDescription_CZ},\"scantime_CZ\"=SYSDATE where \"scrap_id\"=#{id}")
    void insertCZ(@Param("id")int id, @Param("RoleName_CZ")String RoleName_CZ, @Param("RoleDescription_CZ")String RoleDescription_CZ);

    @Update("update \"scrap\" set \"CZYJ\"=#{RoleDescription_CZ} where \"id\"=#{id}")
    void UpdateScrapForCZ(@Param("id")int id,@Param("RoleDescription_CZ") String RoleDescription_CZ);
}
