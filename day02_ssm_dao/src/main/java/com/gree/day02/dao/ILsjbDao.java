package com.gree.day02.dao;


public interface ILsjbDao {

/*
    @Select("SELECT \"id\",\"LJMC\", \"GZBM\",\"BZ\",\"LJTH\",\"ZXZQ\",\"JC\",\"WLBM\",\"LQSJ\",\"RQ\",\n" +
            "        CASE LJSB_JC\n" +
            "\tWHEN 1 THEN\n" +
            "\t\t'待质控审核'\n" +
            "\tELSE\n" +
            "\t\t'已结单' END AS LJSB_JC\n" +
            "  FROM \"ZS_LJSJB\" order by \"scantime\" desc")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "LJMC",column = "LJMC"),
            @Result(property = "GZBM",column = "GZBM"),
            @Result(property = "BZ,",column = "BZ,"),
            @Result(property = "LJTH",column = "LJTH"),
            @Result(property = "ZXZQ",column = "ZXZQ"),
            @Result(property = "JC",column = "JC"),
            @Result(property = "WLBM",column = "WLBM"),
            @Result(property = "LQSJ",column = "LQSJ"),
            @Result(property = "RQ",column = "RQ"),
            @Result(property = "LJSB_JC",column = "LJSB_JC"),
    })
    List<Lsjb> findLsjb()throws Exception;


    @Select("select * form \"ZS_LJSJB\" where \"id\"=#{id}")
    List<Lsjb> findljsjbById(@Param("id")int id);

     @Insert("insert INTO \"ZS_LJSJB\" (\n" +
            "LJMC, \n" +
            "GZBM, \n" +
            "BZ, \n" +
            "LJTH, \n" +
            "ZXZQ, \n" +
            "JC, \n" +
            "WLBM, \n" +
            "LQSJ, \n" +
            "RQ, \n" +
            "CL_YQ, \n" +
            "CL_JG, \n" +
            "CL_JL, \n" +
            "YS_YQ, \n" +
            "YS_JG, \n" +
            "YS_JL, \n" +
            "SCZ_YQ, \n" +
            "SCZ_JG, \n" +
            "SCZ_JL, \n" +
            "ROHS_YQ, \n" +
            "ROHS_JG, \n" +
            "ROHS_JL, \n" +
            "CC_YQ1, \n" +
            "CC_JG1, \n" +
            "CC_JL1, \n" +
            "CC_YQ2, \n" +
            "CC_YQ3, \n" +
            "CC_YQ4, \n" +
            "CC_YQ5, \n" +
            "CC_YQ6, \n" +
            "CC_JG2, \n" +
            "CC_JG3, \n" +
            "CC_JG4, \n" +
            "CC_JG5, \n" +
            "CC_JG6, \n" +
            "CC_JL2, \n" +
            "CC_JL3, \n" +
            "CC_JL4, \n" +
            "CC_JL5, \n" +
            "CC_JL6, \n" +
            "JG1, \n" +
            "JL1, \n" +
            "JG2, \n" +
            "JL2, \n" +
            "JG3, \n" +
            "JL3, \n" +
            "JG4, \n" +
            "JL4, \n" +
            "JG5, \n" +
            "JL5, \n" +
            "JG6, \n" +
            "JL6, \n" +
            "JG7, \n" +
            "JL7, \n" +
            "JG8, \n" +
            "JL8, \n" +
            "JG9, \n" +
            "JL9, \n" +
            "JG10, \n" +
            "JL10, \n" +
            "CZG, \n" +
            "LB, \n" +
            "JYY, \n" +
            "XJ, \n" +
            "CLYQ, \n" +
            "JYDW, \n" +
            "BAZ,SJJL,LJSB_JC\"scantime\"\n" +
            ")values(#{LJMC},#{GZBM},#{BZ},#{LJTH},#{ZXZQ},#{JC},#{WLBM},#{LQSJ},#{RQ},#{CL_YQ},#{CL_JG},#{CL_JL},#{YS_YQ},#{YS_JG},#{YS_JL},#{SCZ_YQ},#{SCZ_JG},#{SCZ_JL},#{ROHS_YQ},#{ROHS_JG},#{ROHS_JL},#{CC_YQ1},#{CC_JG1},#{CC_JL1},#{CC_YQ2},#{CC_YQ3},#{CC_YQ4}," +
            "#{CC_YQ5},#{CC_YQ6},#{CC_JG2},#{CC_JG3},#{CC_JG4},#{CC_JG5},#{CC_JG6},#{CC_JL2},#{CC_JL3},#{CC_JL4},#{CC_JL5},#{CC_JL6},#{JG1},#{JL1},#{JG2},#{JL2},#{JG3},#{JL3},#{JG4},#{JL4},#{JG5},#{JL5},#{JG6},#{JL6},#{JG7},#{JL7},#{JG8},#{JL8},#{JG9},#{JL9},#{JG10},#{JL10},#{CZG},#{LB},#{JYY},#{XJ},#{CLYQ},#{JYDW},#{BAZ},#{SJJL},#{LJSB_JC},SYSDATE")
     void saveLjsj(Lsjb lsjb)throws Exception;



    @Select("SELECT \"id\",\"LJMC\", \"GZBM\",\"BZ\",\"LJTH\",\"ZXZQ\",\"JC\",\"WLBM\",\"LQSJ\",\"RQ\",\n" +
            "        CASE \"LJSB_JC\"\n" +
            "\tWHEN 1 THEN\n" +
            "\t\t'待质控审核'\n" +
            "\tELSE\n" +
            "\t\t'已结单' END AS LJSB_JC\n" +
            "  FROM \"ZS_LJSJB\" where \"LJSB_JC\"=1 order by \"scantime\" desc\n")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "LJMC",column = "LJMC"),
            @Result(property = "GZBM",column = "GZBM"),
            @Result(property = "BZ,",column = "BZ,"),
            @Result(property = "LJTH",column = "LJTH"),
            @Result(property = "ZXZQ",column = "ZXZQ"),
            @Result(property = "JC",column = "JC"),
            @Result(property = "WLBM",column = "WLBM"),
            @Result(property = "LQSJ",column = "LQSJ"),
            @Result(property = "RQ",column = "RQ"),
            @Result(property = "LJSB_JC",column = "LJSB_JC"),
    })
    List<Lsjb> findZKSK()throws Exception;



*/




}
