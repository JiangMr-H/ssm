/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ordersServiceImpl
 * Author:   891649
 * Date:     2019/7/3 11:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IOrdersDao;
import com.gree.day02.dao.Orders;
import com.gree.day02.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/3
 * @since 1.0.0
 */
@Service
@Transactional
public class ordersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public List<Orders> findAll() throws Exception {
        List<Orders> ordersList = iOrdersDao.findAll();
        return ordersList;
    }
}