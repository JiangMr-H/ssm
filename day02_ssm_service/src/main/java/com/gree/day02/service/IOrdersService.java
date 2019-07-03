package com.gree.day02.service;

import com.gree.day02.dao.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll() throws Exception;
}
