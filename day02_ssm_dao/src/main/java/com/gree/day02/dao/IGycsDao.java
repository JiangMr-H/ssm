package com.gree.day02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IGycsDao {

    @Select("SELECT z.\"id\",z.CPMC,z.JYY,z.JCBM,z.BC,z.JCRQ,z.\"scantime\" FROM \"ZS_GYCS_1\" z order by \"scantime\" desc")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "CPMC",column = "CPMC"),
            @Result(property = "JYY",column = "JYY"),
            @Result(property = "JCBM",column = "JCBM"),
            @Result(property = "BC",column = "BC"),
            @Result(property = "JCRQ",column = "JCRQ"),
            @Result(property = "scantime",column = "scantime"),
    })
    public List<GYCS> findGycs();


    @Insert("INSERT INTO \"ZS_GYCS_1\" z (\"id\",CPMC,JYY,JCBM,BC,JCRQ,YL1,YL2,YL3,YL4,YL5,YL6,YL7,SD1,SD2,SD3,SD4,SD5,SD6,SD7,WZ1,WZ2,WZ3,WZ4,WZ5,WZ6,WZ7,WD1,WD2,WD3,WD4,WD5,WD6,WD7,SJ,LQ,BYA,JCSJ,BZ,\"scantime\",\"LB_Id\" )VALUES(\n" +
            "4,#{CPMC},#{JYY},#{JCBM},#{BC},#{JCRQ},#{YL1},#{YL2},#{YL3},#{YL4},#{YL5},#{YL6},#{YL7},#{SD1},#{SD2},#{SD3},#{SD4},#{SD5},#{SD6},#{SD7},#{WZ1},#{WZ2},#{WZ3},#{WZ4},#{WZ5},#{WZ6},#{WZ7},#{WD1},#{WD2},#{WD3},#{WD4},#{WD5},#{WD6},#{WD7},#{SJ},#{LQ},#{BYA},#{JCSJ},#{BZ},SYSDATE,1\n" +
            ")")
    void gycsAdd(GYCS gycs);

    /**
     * 查询调试员列表
     * @return
     */
    @Select("SELECT z.\"id\",z.CPMC,z.JYY,z.JCBM,z.BC,z.JCRQ,z.\"scantime\",s.JC from \"ZS_GYCS_1\" z\n" +
            "            INNER JOIN \"ZS_GYCS_LB\" s ON z.\"LB_Id\"=s.\"id\" where z.\"LB_Id\"=#{count}  order by z.\"scantime\" DESC")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "CPMC",column = "CPMC"),
            @Result(property = "JYY",column = "JYY"),
            @Result(property = "JCBM",column = "JCBM"),
            @Result(property = "BC",column = "BC"),
            @Result(property = "JCRQ",column = "JCRQ"),
            @Result(property = "JC",column = "JC"),
            @Result(property = "scantime",column = "scantime"),
    })
    List<GYCS> findGycs2(int count);


    @Select("select * from \"ZS_GYCS_1\" where \"id\"=#{scrapId}")
    GYCS findByTJYId(int scrapId);
}
