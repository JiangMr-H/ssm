package com.gree.day02.dao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IProductDao {

    //根据ID查询产品
    @Select("select * from product where id=#{OrdersId}")
    public Product findById(String OrdersId)throws Exception;


    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll()throws Exception;

    //添加产品信息
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus)" +
            " values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void add(Product product);
}
