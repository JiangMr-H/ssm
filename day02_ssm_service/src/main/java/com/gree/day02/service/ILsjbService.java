package com.gree.day02.service;

import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.Lsjb;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ILsjbService {


   List<Lsjb> findAllljsj(int page, int size)throws Exception ;

   List<Lsjb> findljsjbById(int id)throws Exception ;

    void saveLjsj(Lsjb lsjb)throws Exception ;

    List<Lsjb> findZKSK(int page, int size)throws Exception ;

    void updateZKSK(int id)throws Exception ;

    /*  void lsjbAdd(Lsjb lsjb);*/
}
