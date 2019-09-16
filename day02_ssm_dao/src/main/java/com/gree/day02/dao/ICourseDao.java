package com.gree.day02.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICourseDao {

    @Select("select \"currentProcess\" from \"course\" where \"id\" in (select \"course\" from \"scrapId_course\")")
    public List<Course> findCourseByScrapId()throws Exception;
}
