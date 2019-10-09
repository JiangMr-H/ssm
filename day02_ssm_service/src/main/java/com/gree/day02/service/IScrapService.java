package com.gree.day02.service;

import com.gree.day02.dao.Approval;
import com.gree.day02.dao.Course;
import com.gree.day02.dao.Scrap;

import java.util.List;


public interface IScrapService {

 List<Scrap> findTSY(int page, int size)throws Exception;

    void scrapAdd(Scrap scrap);

    Scrap findscrapById(int scrapId);

    List<Scrap>findAll(int page, int size,int count)throws Exception;

    void ScarpUpdate(int scrapId)throws Exception;

   void insertTJY(int T_id,String RoleName_TJY,String RoleDescription_TJY)throws Exception;

    void UpdateZz(int id, String roleName_zz, String roleDescription_zz);

    void UpdateJYy(int id, String roleName_jYy, String roleDescription_jYy);

    void UpdateJSY(int id, String roleName_jsy, String roleDescription_jsy);

    void UpdateZLJS(int id, String roleName_zljs, String roleDescription_zljs);

    void insertCZ(int id, String roleName_cz, String roleDescription_cz);

    void ScarpUpdateZz(int id);

    void ScarpUpdateJYy(int id);

    void ScarpUpdateJSY(int id);

    void ScarpUpdateZLJS(int id);

    void ScarpUpdateCZ(int id);
}
