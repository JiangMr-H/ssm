package com.gree.day02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IsendMailDao {

    @Select("SELECT m.\"username\",m.\"mailPwd\" ,b.* FROM USERS u INNER JOIN \"mail\" m on u.\"ID\"=m.\"userId\"\n" +
            "LEFT JOIN \"mailBox\" b on m.\"userId\"=b.\"userId\"\n" +
            "where username=#{name}")
    Mail findMail(String name);

    @Insert("insert into \"mail\"(\"userId\",\"username\",\"mailPwd\",\"time\") values(#{userId},#{username},#{mailPwd},SYSDATE)")
    void saveMail(Mail mail);

    @Insert("insert into \"mailBox\"(\"userId\",\"title\",\"mainText\",\"addresser\",\"recipients\",\"copyRecipients\",\"inputTime\")values(#{userId}," +
            "#{title},#{mainText},#{addresser},#{recipients},#{copyRecipients},SYSDATE)")
    void saveMailBox(Mail mail);

    @Select("SELECT \"ID\" FROM \"USERS\" where username=#{name}")
    String findUserIdByusername(String name);

    @Update("UPDATE \"mailBox\" SET \"title\"=#{title},\"mainText\"=#{mainText},\"addresser\"=#{addresser},\"recipients\"=#{recipients},\"copyRecipients\"=#{copyRecipients},\"updateTime\"=SYSDATE where \"userId\"=#{userId}")
    void updateMail(Mail mail);
}
