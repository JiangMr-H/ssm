package com.gree.day02.service;

import com.gree.day02.dao.Approval;
import com.gree.day02.dao.Course;
import com.gree.day02.dao.Scrap;

import java.util.List;


public interface IScrapService {

 List<Scrap> findAll(int page, int size)throws Exception;

    void scrapAdd(Scrap scrap);

    Scrap findscrapById(int scrapId);

    List<Scrap> findTSY(int page, int size)throws Exception;

    void ScarpUpdate(int scrapId)throws Exception;

   void insertTJY(int T_id,String RoleName_TJY,String RoleDescription_TJY)throws Exception;

}
