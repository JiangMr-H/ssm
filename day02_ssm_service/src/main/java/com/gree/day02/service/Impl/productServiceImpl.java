/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: productServiceImpl
 * Author:   891649
 * Date:     2019/7/2 14:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IProductDao;
import com.gree.day02.dao.Product;
import com.gree.day02.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/2
 * @since 1.0.0
 */
@Service
@Transactional
public class productServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    public List<Product> findAll()throws Exception{
     List<Product> productList = productDao.findAll();
     return productList;
    }

    @Override
    public void add(Product product)throws Exception{
        productDao.add(product);
    }

}