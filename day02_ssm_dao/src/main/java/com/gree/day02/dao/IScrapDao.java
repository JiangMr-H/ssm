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
    public List<Scrap> findAll();

    /*
    录入报废单信息
     */
    @Insert("insert into \"scrap\"(SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"remake\",\"scantime\",\"courseId\")values(" +
            "#{SCRQ},#{BZ},#{CPBM},#{GZBM},#{CLYS},#{JCBM},#{GYTS},#{QL},#{HBD},#{HW},#{QW},#{YS},#{SBW},#{SS},#{LSL},#{LBH},#{SJ},#{BX},#{SY},#{DKDL},#{YWB},#{SC},#{DS},#{HS},#{NM},#{MC},#{TJBL},#{SYBL},#{SM},#{SLHJ},#{JK},#{CZG},#{remake},SYSDATE,1)")
    void scrapAdd(Scrap scrap);


    @Select("SELECT SCRQ,BZ,CPBM,GZBM,CLYS,JCBM,GYTS,QL,HBD,HW,QW,YS,SBW,SS,LSL,LBH,SJ,BX,SY,DKDL,YWB,SC,DS,HS,NM,MC,TJBL,SYBL,SM,SLHJ,JK,CZG,\"remake\" from \"scrap\" where \"id\"=#{scrapId}")
    Scrap findscrapById(int scrapId);

    /**
     * 查询调试员列表
     * @return
     */
    @Select("SELECT s.\"id\",s.SCRQ,s.BZ,s.CPBM,s.GZBM,s.CLYS,s.JCBM,co.\"currentProcess\" course from \"scrap\" s\n" +
            "            INNER JOIN \"course\" co ON s.\"courseId\"=co.\"id\" where s.\"courseId\"=1  order by s.\"scantime\" DESC")
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

    /**
     * 修改状态（调试员审批后）
     */
    @Update("update  set ")
    void ScarpUpdate(Scrap scarp,Approval approval);


    /**
     * 录入调试员描述信息
     */
    void insertTJY(Approval approval);

}
