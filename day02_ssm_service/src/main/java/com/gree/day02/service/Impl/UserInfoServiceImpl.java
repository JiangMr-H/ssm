/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfoServiceImpl
 * Author:   891649
 * Date:     2019/7/9 10:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IUserInfoDao;
import com.gree.day02.dao.Role;
import com.gree.day02.dao.UserInfo;
import com.gree.day02.service.IUserInfoService;
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
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public List<UserInfo> findAll() throws Exception {
        List<UserInfo> infoList = userInfoDao.findAll();
        return infoList;
    }

    @Override
    public void save(UserInfo userInfo) throws Exception {
        userInfoDao.save(userInfo);
    }

    @Override
    public UserInfo findById(String id) throws Exception {
       UserInfo userInfo = userInfoDao.findById(id);
        return userInfo;
    }

    @Override
    public List<Role> findOtherRole(String userid) throws Exception{
      List<Role> roleList=  userInfoDao.findOtherRole(userid);


        return roleList;
    }

    @Override
    public void addRoleToUser(String userId, String[] roleIds) {

        //遍历出每个roleid 然后使其作为参数录入
        for (String roleId : roleIds){
            userInfoDao.addRoleToUser(userId,roleId);
        }

    }
}