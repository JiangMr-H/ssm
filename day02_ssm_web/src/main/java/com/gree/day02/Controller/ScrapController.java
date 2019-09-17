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
import com.gree.day02.dao.Approval;
import com.gree.day02.dao.Course;
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
     * 查询报废单列表
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public  ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Scrap> scrapList = scrapService.findAll(page,size);
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
        return "redirect:findAll.do";
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

    /**
     * 查询调试员报废单列表
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findTSY.do")
    public  ModelAndView findTSY(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Scrap> scrapList = scrapService.findTSY(page,size);
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("audit_TSY_list");
        return mv;
    }


    @RequestMapping("/updateTJY.do")
    public String scrapUpdate(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "RoleName_TJY",required = true)String RoleName_TJY,@RequestParam(name = "RoleDescription_TJY",required = true)String RoleDescription_TJY)throws Exception
    {

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++"+id+"++++1++"+RoleName_TJY);
        scrapService.insertTJY(id,RoleName_TJY,RoleDescription_TJY);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++"+id+"++++2++"+RoleName_TJY);
        //修改
       scrapService.ScarpUpdate(id);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++"+id+"++++3++"+RoleName_TJY);
        return "redirect:findAll.do";
    }












}