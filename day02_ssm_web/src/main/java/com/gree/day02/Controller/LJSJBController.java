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
import com.gree.day02.service.ILjsjService;
import com.gree.day02.service.ILsjbService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @create 2019/10/8
 * @since 1.0.0
 */

@Controller
@RequestMapping("/ljsjb")
@Transactional
public class LJSJBController {

    @Autowired
    private ILjsjService iLjsjService;

    /**
     * 列表查询
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllljsj.do" )
    public ModelAndView findAllljsj(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv =new ModelAndView();
        List<Lsjb> LsjbList = iLjsjService.findAllljsj(page,size);
        PageInfo pageInfo = new PageInfo(LsjbList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("ZS_LJSJB");
        return mv;
    }

    /**
     * 保存零件首检
     * @param lsjb
     * @return
     */
    @RequestMapping("/saveLjsj.do")
    public String saveLjsj(Lsjb lsjb)throws Exception {
        iLjsjService.saveLjsj(lsjb);
        return "redirect:findAllljsj.do";
    }

    /**
     * 查询质控审核列表
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findZKSK.do")
    public ModelAndView findZKSK(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv =new ModelAndView();
        List<Lsjb> LsjbList = iLjsjService.findZKSK(page,size);
        PageInfo pageInfo = new PageInfo(LsjbList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("ZK_SH_list");
        return mv;
    }

    @RequestMapping("/updateZKSK")
    public String updateZKSK(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "SJJL",required = true)String SJJL)throws Exception {
        iLjsjService.updateZKSK(id,SJJL);
        return "redirect:findZKSK.do";
    }

    @RequestMapping("/findljsjbById.do")
    public ModelAndView findljsjbById(@RequestParam(name = "id",required = true)int id){
        ModelAndView mv =new ModelAndView();
        Lsjb  LsjbList = iLjsjService.findljsjbById(id);
        mv.addObject("LsjbList",LsjbList);
        mv.setViewName("ZS_LJSJB_ZK");
        return mv;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)int id){
        ModelAndView mv =new ModelAndView();
        Lsjb  LsjbList = iLjsjService.findljsjbById(id);
        mv.addObject("LsjbList",LsjbList);
        mv.setViewName("ZS_LJSJB_CX");
        return mv;
    }





}