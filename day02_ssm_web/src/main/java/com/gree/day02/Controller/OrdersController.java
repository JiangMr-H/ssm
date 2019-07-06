/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OrdersController
 * Author:   891649
 * Date:     2019/7/3 11:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.github.pagehelper.PageInfo;
import com.gree.day02.dao.Orders;
import com.gree.day02.service.IOrdersService;
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
 * @create 2019/7/3
 * @since 1.0.0
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    //查询全部订单分页
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page,@RequestParam(name = "size",required = true,defaultValue = "10")int size)throws Exception{
        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList = iOrdersService.findAll(page, size);
       //PageInfo 就是一个分页Bean
        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }


    @RequestMapping("findById.do")
    public ModelAndView findAll(@RequestParam(name = "id",required = true)String ordersId) throws Exception {
        ModelAndView mv =new ModelAndView();
        Orders orders = iOrdersService.findById(ordersId);

         mv.addObject("orders",orders);
         mv.setViewName("orders-show");

         return mv;
    }



    //查询全部订单--未分页
/*    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList = iOrdersService.findAll();
        mv.addObject("ordersList",ordersList);
        mv.setViewName("orders-list");
        return mv;
    }*/

}