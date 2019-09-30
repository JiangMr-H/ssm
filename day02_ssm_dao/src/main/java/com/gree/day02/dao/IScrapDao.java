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
    public List<Scrap> findTSY();

    /*
    ¼�뱨�ϵ���Ϣ
     */
    @Insert("insert into \"scrap\"(SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"remake\",\"scantime\",\"courseId\")values(" +
            "#{SCRQ},#{BZ},#{CPBM},#{GZBM},#{CLYS},#{JCBM},#{GYTS},#{QL},#{HBD},#{HW},#{QW},#{YS},#{SBW},#{SS},#{LSL},#{LBH},#{SJ},#{BX},#{SY},#{DKDL},#{YWB},#{SC},#{DS},#{HS},#{NM},#{MC},#{TJBL},#{SYBL},#{SM},#{SLHJ},#{JK},#{CZG},#{remake},SYSDATE,1)")
    void scrapAdd(Scrap scrap);


    @Select("SELECT \"id\",SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"remake\" from \"scrap\" where \"id\"=#{scrapId}")
    Scrap findscrapById(int scrapId);

    /**
     * ��ѯ����Ա�б�
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
     * �޸�״̬������Ա������
     */
    @Update("update \"scrap\" SET \"courseId\"=2 where \"id\"=#{scarpid}")
    void ScarpUpdate(int scarpid);

    /**
     * ¼�����Ա������Ϣ
     * @param id
     * @param
     * @param
     */
    @Insert("insert into \"ZS_Approval\"(\"scrap_id\",\"RoleName_TJY\",\"RoleDescription_TJY\",\"scantime_TJY\")values(#{id},#{RoleName_TJY},#{RoleDescription_TJY},SYSDATE)")
    void insertTJY(@Param("id") int id,@Param("RoleName_TJY") String RoleName_TJY,@Param("RoleDescription_TJY") String RoleDescription_TJY);








}
