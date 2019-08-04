/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RoleServiceImpl
 * Author:   891649
 * Date:     2019/7/9 17:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IRoleDao;
import com.gree.day02.dao.Permission;
import com.gree.day02.dao.Role;
import com.gree.day02.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/9
 * @since 1.0.0
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll() throws Exception {

        List<Role> list = roleDao.findAll();
       return list;
    }

    @Override
    public void save(Role role) throws Exception {
        roleDao.save(role);
    }

    @Override
    public Role findById(String roleId) throws Exception{
        Role role= roleDao.findById(roleId);
        return role;
    }

    @Override
    public List<Permission> findOtherPermissions(String roleId) {
     return roleDao.findOtherPermissions(roleId);

    }

    @Override
    public void addPermissionToRole(String roleId,String[]permissionIds) {
        for(String permissionId : permissionIds){
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }
}