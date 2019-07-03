package com.gree.day02.service;

import com.gree.day02.dao.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll()throws Exception;

   public void add(Product product) throws Exception;
}
