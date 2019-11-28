package com.gree.day02.service;

import com.gree.day02.dao.Lsjb;

import java.util.List;

public interface ILjsjService {
    List<Lsjb> findAllljsj(int page, int size);

    void saveLjsj(Lsjb lsjb);

    List<Lsjb> findZKSK(int page, int size);

   


    Lsjb findljsjbById(int id);

    void updateZKSK(int id, String SJJL);
}
