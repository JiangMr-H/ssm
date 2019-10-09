/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GYCSController
 * Author:   891649
 * Date:     2019/10/8 9:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.github.pagehelper.PageInfo;
import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.Scrap;
import com.gree.day02.service.IGycsService;
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
 * @create 2019/10/8
 * @since 1.0.0
 */

@Controller
@RequestMapping("/GYCS")
public class GYCSController {

   @Autowired
   private IGycsService iGycsService;


   /**
    * 查询工艺参数表
    * @param page
    * @param size
    * @return
    * @throws Exception
    */
   @RequestMapping("/findGycs.do")
   public ModelAndView findGycs(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
      ModelAndView mv = new ModelAndView();
      List<GYCS> GycsList = iGycsService.findGycs(page,size);
      PageInfo pageInfo = new PageInfo(GycsList);
      mv.addObject("pageInfo",pageInfo);
      mv.setViewName("Charting_Query_list");
      return mv;
   }

   @RequestMapping("/findGycs2.do")
    public  ModelAndView findAll2(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size,int count) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<GYCS> scrapList=null;
       if(count==1){
            scrapList = iGycsService.findGycs2(page,size,count);
            mv.setViewName("paperless-JYy-list");
        }else if(count==2){
            scrapList = iGycsService.findGycs2(page,size,count);
            mv.setViewName("paperless-TJY-list");
        }else if(count==3){
            scrapList = iGycsService.findGycs2(page,size,count);
            mv.setViewName("paperless-ZK-list");
        }else if(count==4){
          scrapList = iGycsService.findGycs2(page,size,count);
          mv.setViewName("paperless-GY-list");
       }
        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }


   /**
    * 录入工艺参数表
    * @param gycs
    * @return
    */
   @RequestMapping("/save.do")
   public String gycsAdd(GYCS gycs){
      System.out.println("gycs===================="+gycs);
      iGycsService.gycsAdd(gycs);
      return "redirect:findGycs.do";
   }


    /**
     *
     * @param scrapId
     * @return
     */
    @RequestMapping("/findByTJYId.do")
    public ModelAndView findByTJYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-TJY-show");
        return mv;
    }

    @RequestMapping("/findByJYYId.do")
    public ModelAndView findByJYYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-JYY-show");
        return mv;
    }

    @RequestMapping("/findByZKId.do")
    public ModelAndView findByZKId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-ZK-show");
        return mv;
    }

    @RequestMapping("/findByGYId.do")
    public ModelAndView findByGYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-GY-show");
        return mv;
    }



}