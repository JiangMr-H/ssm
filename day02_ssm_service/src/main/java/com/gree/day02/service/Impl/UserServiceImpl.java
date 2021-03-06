/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   891649
 * Date:     2019/7/6 10:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;



import com.gree.day02.dao.IUserDao;
import com.gree.day02.dao.Role;
import com.gree.day02.dao.UserInfo;
import com.gree.day02.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 在这里用到了Spring Security
 * 遇见的问题：成功登录 但点击里面的进程时候报无权限（403）
 * 解决方式为：数据库中间表中用户user与权限表role为多对多的关系，且权限名应该是唯一不相同的
 *但我在role表中添加了两个相同的权限名，并只将其中一个在中间表中与用户绑定，所以导致所有的用户均可登录但里面的进程无权限
 *
 * @author 891649
 * @create 2019/7/6
 * @since 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo=null;
        try {
             userInfo = userDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
       // User user = new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),getAuthority());
       User user = new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),userInfo.getStatus()==0?false:true,true,true,true,getAuthority(userInfo.getRoles()));
        return user;
    }

  /*  private List<SimpleGrantedAuthority> getAuthority() {
        List<SimpleGrantedAuthority> list =new ArrayList<>();
            list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return list;
    }*/

    private List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
       List<SimpleGrantedAuthority> list =new ArrayList<>();

       for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
    return list;
    }
}