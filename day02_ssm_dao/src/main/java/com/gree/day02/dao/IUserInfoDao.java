package com.gree.day02.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserInfoDao {

    @Select("select * from users")
    public List<UserInfo> findAll()throws Exception;

    @Insert("insert into users(email,username,password,phoneNum,status)values(#{email},#{username},#{password},#{phoneNum},#{status})")
    public void save(UserInfo userInfo)throws Exception;


    @Select("select * from users where id=#{id}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "email",column = "email"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.gree.day02.dao.IRoleDao.findByUserId")),
    })
    public UserInfo  findById(String id)throws Exception;

/*
*    我要给用户添加角色
*    1、首先我要拿用户的ID在中间表users_role中查该用户已有的所有角色的ID
*    2、再在角色表中查找不在这个已有角色id的角色
*/
    @Select("select * from role where id not in (select roleId from users_role where userId =#{userId})")
    List<Role>findOtherRole(String userId)throws Exception;


    @Insert("insert into users_role (userId,roleId) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId")String userId, @Param("roleId") String roleId);
}
