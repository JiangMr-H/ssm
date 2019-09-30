/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ScrapController
 * Author:   891649
 * Date:     2019/8/14 15:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;


import com.github.pagehelper.PageInfo;
import com.gree.day02.dao.Scrap;
import com.gree.day02.service.IScrapService;
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
 * @create 2019/8/14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/scrap")
public class ScrapController {

     @Autowired
     private IScrapService scrapService;



    /**
     * 菜单栏 打开页面跳转
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public  ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size,int count) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Scrap> scrapList=null;
        if(count==1){
            scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_TSY_list"); //调机员
        }else if(count==2){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_Zz_list"); //班长
        }else if(count==3){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_JYy_list"); //检验员
        }else if(count==4){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_JSY_list"); //接收员
        }else if(count==5){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_ZLJS_list"); //质量科长
        }else if(count==6){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_CZ_list");  //厂长
        }else if(count==7){
             scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_ProcessQuery"); //进程查询
        }
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        return mv;


       /* ModelAndView mv = new ModelAndView();
        List<Scrap> scrapList = scrapService.findAll(page,size,count);
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        if(count==1){
            mv.setViewName("audit_TSY_list"); //调机员
        }else if(count==2){
            mv.setViewName("audit_Zz_list"); //班长
        }else if(count==3){
            mv.setViewName("audit_JYy_list"); //检验员
        }else if(count==4){
            mv.setViewName("audit_JSY_list"); //接收员
        }else if(count==5){
            mv.setViewName("audit_ZLJS_list"); //质量科长
        }else if(count==6){
            mv.setViewName("audit_CZ_list");  //厂长
        }else if(count==7){
            mv.setViewName("audit_ProcessQuery"); //进程查询
        }
        return mv;*/
    }

    /**
     * 查询报废单列表
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findNewPage.do")
    public  ModelAndView findTSY(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Scrap> scrapList = scrapService.findTSY(page,size);
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("scrap-list");
        return mv;
    }

    /**
     * 录入报废单信息
     * @param scrap
     * @return
     */
    @RequestMapping("/save.do")
    public String scrapAdd(Scrap scrap){
        scrapService.scrapAdd(scrap);
        return "redirect:findNewPage.do";
    }

    /**
     *
     * @param scrapId
     * @return
     */
    @RequestMapping("/findById.do")
    public ModelAndView findscrapById(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-show");
        return mv;
    }



    @RequestMapping("/updateTJY.do")
    public String scrapUpdate(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_TJY",required = true)String RoleName_TJY,@RequestParam(name = "RoleDescription_TJY",required = true)String RoleDescription_TJY,int count1)throws Exception
    {
       scrapService.insertTJY(id,RoleName_TJY,RoleDescription_TJY);
       scrapService.ScarpUpdate(id);
       return "redirect:findAll.do?count=count1";
    }












}