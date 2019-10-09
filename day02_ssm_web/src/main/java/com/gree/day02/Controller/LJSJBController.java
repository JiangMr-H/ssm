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
import com.gree.day02.dao.Lsjb;
import com.gree.day02.service.IGycsService;
import com.gree.day02.service.ILsjbService;
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
@RequestMapping("/ljsjb")
public class LJSJBController {

   @Autowired
   private ILsjbService iLsjbService;


   /**
    * 查询工艺参数表
    * @param page
    * @param size
    * @return
    * @throws Exception
    */
  /* @RequestMapping("/findljsjb.do")
   public ModelAndView findLsjbs(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
      ModelAndView mv = new ModelAndView();
      List<Lsjb> LsjbList = iLsjbService.findLsjb(page,size);
      PageInfo pageInfo = new PageInfo(LsjbList);
      mv.addObject("pageInfo",pageInfo);
      mv.setViewName("ZS_LJSJB");
      return mv;
   }*/

   /**
    * 录入工艺参数表
    * @param lsjb
    * @return
    */
  /* @RequestMapping("/save.do")
   public String LsjbAdd(Lsjb lsjb){
      System.out.println("gycs===================="+lsjb);
      iLsjbService.lsjbAdd(lsjb);
      return "redirect:findGycs.do";
   }*/



}