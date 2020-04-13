package com.gree.day02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface IsendMailDao {

    @Select("select * from USERS u join \"mail\" m on u.ID=m.\"userId\"\n" +
            "left join \"mailBox\" b on m.\"id\"=b.\"mailId\"\n" +
            "where u.username=#{name}")
    mail findMail(String name);

    @Insert("insert into \"mail\"(\"userId\",\"username\",\"password\",\"time\") values(#{userId},#{username},#{password},SYSDATE)")
    void saveMail(mail mail);

    @Insert("insert into \"mailBox\"(\"mailId\",\"title\",\"mainText\",\"addresser\",\"recipients\",\"copyRecipients\",\"sernTime\",\"inputTime\")values(#{mailId}," +
            "#{title},#{mainText},#{addresser},#{recipients},#{copyRecipients},#{sernTime},SYSDATE)")
    void saveMailBox(mailBox mailBox);

}
