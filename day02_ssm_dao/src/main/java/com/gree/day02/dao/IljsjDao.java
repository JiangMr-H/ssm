package com.gree.day02.dao;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IljsjDao {

    @Select("SELECT \"id\",\"LJMC\", \"GZBM\",\"BZ\",\"scantime\",\"LJTH\",\"ZXZQ\",\"JC\",\"WLBM\",\"LQSJ\",\"RQ\",\n" +
            "        CASE LJSB_JC\n" +
            "\tWHEN 1 THEN\n" +
            "\t\t'待质控审核'\n" +
            "\tELSE\n" +
            "\t\t'已结单' END AS LJSB_JC\n" +
            "  FROM \"ZS_LJSJB\" order by \"scantime\" desc")
    List<Lsjb> findAllljsj();


    @Insert("insert INTO \"ZS_LJSJB\" (\n" +
            "\t        \"LJMC\", \"GZBM\",\"BZ\", \"LJTH\", \"ZXZQ\", \"JC\", \"WLBM\", \"LQSJ\",\"RQ\",\"CL_YQ\", \n" +
            "\t        \"CL_JG\", \"CL_JL\",\"YS_YQ\", \"YS_JG\", \"YS_JL\", \"SCZ_YQ\", \"SCZ_JG\", \"SCZ_JL\",\"CC_YQ6\", \"CC_JG2\", \n" +
            "\t        \"ROHS_YQ\", \"ROHS_JG\", \"ROHS_JL\", \"CC_YQ1\", \"CC_JG1\", \"CC_JL1\", \"CC_YQ2\", \"CC_YQ3\", \"CC_YQ4\", \"CC_YQ5\", \n" +
            "\t        \"CC_JG3\", \"CC_JG4\", \"CC_JG5\", \"CC_JG6\", \"CC_JL2\", \"CC_JL3\", \"CC_JL4\",\"CC_JL5\",\"CC_JL6\",\"JG1\", \n" +
            "\t        \"JL1\", \"JG2\", \"JL2\", \"JG3\", \"JL3\", \"JG4\",  \"JL4\", \"JG5\", \"JL5\", \"JG6\", \n" +
            "\t        \"JL6\", \"JG7\", \"JL7\", \"JG8\", \"JL8\", \"JG9\", \"JL9\", \"JG10\", \"JL10\", \"CZG\", \n" +
            "\t        \"JYY\", \"CLYQ\", \"JYDW\", \"BAZ\", \"LJSB_JC\", \"scantime\")values(\n" +
            "\t\t\t\t\t         #{LJMC},#{GZBM},#{BZ},#{LJTH},#{ZXZQ},#{JC},#{WLBM},#{LQSJ},#{RQ},#{CL_YQ},\n" +
            "\t\t\t\t\t      #{CL_JG},#{CL_JL},#{YS_YQ},#{YS_JG},#{YS_JL},#{SCZ_YQ},#{SCZ_JG},#{SCZ_JL},#{CC_YQ6},#{CC_JG2},\n" +
            "\t\t\t\t\t\t\t\t#{ROHS_YQ},#{ROHS_JG},#{ROHS_JL},#{CC_YQ1},#{CC_JG1},#{CC_JL1},#{CC_YQ2},#{CC_YQ3},#{CC_YQ4},#{CC_YQ5},\n" +
            "\t\t\t\t\t\t\t\t#{CC_JG3},#{CC_JG4},#{CC_JG5},#{CC_JG6},#{CC_JL2},#{CC_JL3},#{CC_JL4},#{CC_JL5},#{CC_JL6},#{JG1},\n" +
            "\t\t\t\t\t\t\t\t#{JL1},#{JG2},#{JL2},#{JG3},#{JL3},#{JG4},#{JL4},#{JG5},#{JL5},#{JG6},\n" +
            "\t\t\t\t\t\t\t\t#{JL6},#{JG7},#{JL7},#{JG8},#{JL8},#{JG9},#{JL9},#{JG10},#{JL10},#{CZG},\n" +
            "\t\t\t\t\t\t\t\t\t #{JYY},#{CLYQ},#{JYDW},#{BAZ},1,SYSDATE)")
    void saveLjsj(Lsjb lsjb);

    @Select("SELECT \"id\",\"LJMC\", \"GZBM\",\"BZ\",\"scantime\",\"LJTH\",\"ZXZQ\",\"JC\",\"WLBM\",\"LQSJ\",\"RQ\",\n" +
            "        CASE LJSB_JC\n" +
            "\tWHEN 1 THEN\n" +
            "\t\t'待质控审核'\n" +
            "\tELSE\n" +
            "\t\t'已结单' END AS LJSB_JC\n" +
            "  FROM \"ZS_LJSJB\" where \"LJSB_JC\" =1 order by \"scantime\" desc")
    List<Lsjb> findZKSK();

    @Select("Select * from \"ZS_LJSJB\" where \"id\"=#{id}")
    Lsjb findljsjbById(int id);

    @Update("update ZS_LJSJB set \"SJJL\"=#{SJJL},\"LJSB_JC\" = 2 where \"id\"=#{id}")
    void updateZKSK(@Param("id")int id,@Param("SJJL")String SJJL);
}
