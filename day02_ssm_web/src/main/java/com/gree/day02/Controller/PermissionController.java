/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PermissonController
 * Author:   891649
 * Date:     2019/7/10 16:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.gree.day02.dao.IPermissionDao;
import com.gree.day02.dao.Permission;
import com.gree.day02.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/10
 * @since 1.0.0
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
    ModelAndView mv=new ModelAndView();
    List<Permission> permissionList = permissionService.findAll();
    mv.addObject("permissionlist",permissionList);
    mv.setViewName("permission-list");
    return mv;
}

    @RequestMapping("/save.do")
   public String save(Permission permission)throws Exception{
        permissionService.save(permission);

        return "redirect:findAll.do";
    }
}