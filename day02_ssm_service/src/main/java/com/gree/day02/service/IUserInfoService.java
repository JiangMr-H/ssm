package com.gree.day02.service;

import com.gree.day02.dao.Role;
import com.gree.day02.dao.UserInfo;

import java.util.List;

public interface IUserInfoService {

    public List<UserInfo> findAll()throws Exception;

    void save(UserInfo userInfo)throws Exception;

    UserInfo findById(String id) throws Exception;


    List<Role> findOtherRole(String userid) throws Exception;

    void addRoleToUser(String userId, String[] roleIds);
}
