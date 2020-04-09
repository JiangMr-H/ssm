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
import org.springframework.test.annotation.Rollback;
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
 * @create 2019/8/14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/scrap")
@Transactional
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
      /*  if(count==1){
            scrapList = scrapService.findAll(page,size,count);
            mv.setViewName("audit_TSY_list"); //调机员
        }else*/
        scrapList = scrapService.findAll(page,size,count);
        if(count==2){

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
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        return mv;
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
     *
     * @param scrapId
     * @return
     */
    @RequestMapping("/findByTSYId.do")
    public ModelAndView findscrapById(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-TSY-show");
        return mv;
    }
    /*
    audit_Zz_list
     */
    @RequestMapping("/findByZzId.do")
    public ModelAndView findscrapByZzId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-Zz-show");
        return mv;
    }
    /*
    audit_JYy_list
     */
    @RequestMapping("/findByJYyId.do")
    public ModelAndView findscrapByJYyId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-JYy-show");
        return mv;
    }
    /*
    audit_JSY_list
     */
    @RequestMapping("/findByJSYId.do")
    public ModelAndView findscrapByJSYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-JSY-show");
        return mv;
    }
    /*
    audit_ZLJS_list
     */
    @RequestMapping("/findByZLJSId.do")
    public ModelAndView findscrapByZLJSId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        Scrap TSYscrap =  scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("scrap-ZLJS-show");
        return mv;
    }
    /*
    audit_CZ_list
     */
    @RequestMapping("/findByCZId.do")
    public ModelAndView findscrapByCZId(@RequestParam(name = "id",required = true)int scrapId) {
        ModelAndView mv = new ModelAndView();
        Scrap TSYscrap = scrapService.findscrapById(scrapId);
        mv.addObject("TSYscrap", TSYscrap);
        mv.setViewName("scrap-CZ-show");
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

    @RequestMapping("/updateZz.do")
    public String scrapUpdateZz(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_Zz",required = true)String RoleName_Zz,@RequestParam(name = "RoleDescription_Zz",required = true)String RoleDescription_Zz)throws Exception
    {
        scrapService.insertZz(id,RoleName_Zz,RoleDescription_Zz);
        scrapService.ScarpUpdateZz(id);
        scrapService.UpdateScrapForZz(id,RoleName_Zz);
        return "redirect:findAll.do?count=2";
    }
    @RequestMapping("/updateJYy.do")
    public String scrapUpdateJYy(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_JYy",required = true)String RoleName_JYy,@RequestParam(name = "RoleDescription_JYy",required = true)String RoleDescription_JYy)throws Exception
    {
        scrapService.UpdateJYy(id,RoleName_JYy,RoleDescription_JYy);
        scrapService.ScarpUpdateJYy(id);
        scrapService.UpdateScrapForJYy(id,RoleName_JYy);
        return "redirect:findAll.do?count=3";
    }
    @RequestMapping("/updateJSY.do")
    public String scrapUpdateJSY(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_JSY",required = true)String RoleName_JSY,@RequestParam(name = "RoleDescription_JSY",required = true)String RoleDescription_JSY)throws Exception
    {
        scrapService.UpdateJSY(id,RoleName_JSY,RoleDescription_JSY);
        scrapService.ScarpUpdateJSY(id);
        scrapService.UpdateScrapForJSY(id,RoleName_JSY);
        return "redirect:findAll.do?count=4";
    }
    @RequestMapping("/updateZLJS.do")
    public String scrapUpdateZLJS(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_ZLJS",required = true)String RoleName_ZLJS,@RequestParam(name = "RoleDescription_ZLJS",required = true)String RoleDescription_ZLJS)throws Exception
    {
        scrapService.UpdateZLJS(id,RoleName_ZLJS,RoleDescription_ZLJS);
        scrapService.ScarpUpdateZLJS(id);
        scrapService.UpdateScrapForZLJS(id,RoleDescription_ZLJS);
        return "redirect:findAll.do?count=5";
    }
    @RequestMapping("/updateCZ.do")
    public String scrapUpdateCZ(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_CZ",required = true)String RoleName_CZ,@RequestParam(name = "RoleDescription_CZ",required = true)String RoleDescription_CZ)throws Exception
    {
        scrapService.insertCZ(id,RoleName_CZ,RoleDescription_CZ);
        scrapService.ScarpUpdateCZ(id);
        scrapService.UpdateScrapForCZ(id,RoleDescription_CZ);
        return "redirect:findAll.do?count=6";
    }









}