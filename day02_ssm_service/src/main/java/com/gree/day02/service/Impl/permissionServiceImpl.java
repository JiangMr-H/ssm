/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: permissionServiceImpl
 * Author:   891649
 * Date:     2019/7/10 16:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IPermissionDao;
import com.gree.day02.dao.Permission;
import com.gree.day02.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/10
 * @since 1.0.0
 */
@Service
@Transactional
public class permissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() throws Exception {

        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }
}