package com.gree.day02.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {


    @Select("select * from role")
    public  List<Role> findAll()throws Exception;

    //根据用户ID查询出所有对应的角色
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.gree.day02.dao.IPermissionDao.findPermissionByRoleId")),
    })
    public List<Role> findByUserId(String userId)throws Exception;


    @Insert("insert into Role(roleName,roleDesc)values(#{roleName},#{roleDesc})")
   public void save(Role role)throws Exception;

    @Select("select * from role where id=#{roleId}")
   public Role findById(String roleId) throws Exception;

    @Select("select * from permission where id not in (select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermissions(String roleId);

    @Insert("insert into role_permission (roleId,permissionId)values(#{roleId},#{permissionId})")
    public void addPermissionToRole(@Param("roleId") String roleId,@Param("permissionId") String permissionId);
}
