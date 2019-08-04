package com.gree.day02.service;

import com.gree.day02.dao.Permission;
import com.gree.day02.dao.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll()throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId);

    void addPermissionToRole(String roleId,String[] permissionIds);
}
