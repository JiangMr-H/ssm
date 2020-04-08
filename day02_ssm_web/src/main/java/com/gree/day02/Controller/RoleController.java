/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RoleController
 * Author:   891649
 * Date:     2019/7/9 17:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.gree.day02.dao.Permission;
import com.gree.day02.dao.Role;
import com.gree.day02.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        List<Role> roleList = roleService.findAll();
        ModelAndView mv =new ModelAndView();
        mv.addObject("roleList",roleList);
        mv.setViewName("role-list");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(Role role)throws Exception{
        roleService.save(role);
        return "redirect:findAll.do";
    }

    //角色添加权限
    @RequestMapping("/addPermissionToRole.do")
    public String addPermissionToRole(@RequestParam(name = "roleId",required = true)String roleId,@RequestParam(name = "ids",required = true)String[] permissionIds )throws Exception{
        roleService.addPermissionToRole(roleId,permissionIds);
        return "redirect:findAll.do";
    }



    //根据roleId查询role，并查询出可以添加的权限
    @RequestMapping("/findRoleByIdAndAllPermission.do")
    public ModelAndView findRoleByIdAndAllPermission(@RequestParam(name = "id",required = true)String roleId)throws Exception
    {
        ModelAndView mv=new ModelAndView();
        //根据roleId查询role
       Role role= roleService.findById(roleId);
       //根据roleId查询可以添加的权限
       List<Permission> otherPermissions = roleService.findOtherPermissions(roleId);
       mv.addObject("role",role);
       mv.addObject("permissionList",otherPermissions);
       mv.setViewName("role-permission-add");

       return mv;
    }
}