/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserImplController
 * Author:   891649
 * Date:     2019/7/9 10:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.gree.day02.dao.Role;
import com.gree.day02.dao.UserInfo;
import com.gree.day02.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/9
 * @since 1.0.0
 */
@RequestMapping("/user")
@Controller
public class UserImplController {

    @Autowired
    private IUserInfoService userInfoService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //给用户添加角色
    @RequestMapping("/addRoleToUser.do")
    @Transactional
    public String addRoleToUser(@RequestParam(name = "userId",required = true)String userId,@RequestParam(name = "ids",required = true)String[] roleIds){
      userInfoService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }


    //查询用户以及用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true)String userid)throws Exception{
     ModelAndView mv=new ModelAndView();
        //1、根据用户ID查询用户
       UserInfo userInfo =userInfoService.findById(userid);
       //2、根据用户ID查询可以添加的角色
      List<Role> otherRole = userInfoService.findOtherRole(userid);
      mv.addObject("user",userInfo);
        mv.addObject("roleList",otherRole);
      mv.setViewName("user-role-add");
      return mv;
    }


    @RequestMapping("/findById.do")
    public ModelAndView findById(String id)throws Exception{
       ModelAndView mv=new ModelAndView();
        UserInfo userInfo = userInfoService.findById(id);
        mv.addObject("user",userInfo);
        mv.setViewName("user-show1");
        return mv;
    }



    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        List<UserInfo> userInfoList = userInfoService.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("userList",userInfoList);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/save.do")
    @Transactional
    public String save(UserInfo userInfo)throws Exception{
        //对密码进行加密处理
        //userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userInfoService.save(userInfo);
        return "redirect:findAll.do";
    }





}