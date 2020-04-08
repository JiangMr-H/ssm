/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: scrapServiceImpl
 * Author:   891649
 * Date:     2019/8/14 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.day02.dao.Approval;
import com.gree.day02.dao.Course;
import com.gree.day02.dao.IScrapDao;
import com.gree.day02.dao.Scrap;
import com.gree.day02.service.IScrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/8/14
 * @since 1.0.0
 */
@Service
@Transactional
public class scrapServiceImpl implements IScrapService {

    @Autowired
    private IScrapDao iScrapDao;

   @Override
    public List<Scrap> findTSY(int page, int size) throws Exception{
        PageHelper.startPage(page,size);
        return iScrapDao.findTSY();
    }

    @Override
    public void scrapAdd(Scrap scrap) {
        iScrapDao.scrapAdd(scrap);
    }

    @Override
    public Scrap findscrapById(int scrapId) {
     return iScrapDao.findscrapById(scrapId);
    }

    @Override
    public List<Scrap> findAll(int page, int size,int count) throws Exception {
        PageHelper.startPage(page,size);
        return iScrapDao.findAll(count);
    }


    /*@Override
    public void ScarpUpdate(int scarpid) throws Exception{
        iScrapDao.ScarpUpdate(scarpid);
    }*/


    @Override
    public void insertTJY(int T_id,String RoleName_TJY,String RoleDescription_TJY) throws Exception {
       System.out.println("======================="+T_id);
        iScrapDao.insertTJY(T_id,RoleName_TJY,RoleDescription_TJY);
    }

    @Override
    public void UpdateZz(int id, String roleName_zz, String roleDescription_zz) {
     iScrapDao.UpdateZz(id,roleName_zz,roleDescription_zz);
    }

    @Override
    public void UpdateJYy(int id, String roleName_jYy, String roleDescription_jYy) {
     iScrapDao.UpdateJYy(id,roleName_jYy,roleDescription_jYy);
    }

    @Override
    public void UpdateJSY(int id, String roleName_jsy, String roleDescription_jsy) {
     iScrapDao.UpdateJSY(id,roleName_jsy,roleDescription_jsy);
    }

    @Override
    public void UpdateZLJS(int id, String roleName_zljs, String roleDescription_zljs) {
     iScrapDao.UpdateZLJS(id,roleName_zljs,roleDescription_zljs);

    }

    @Override
    public void insertCZ(int id, String roleName_cz, String roleDescription_cz) {
     iScrapDao.insertCZ(id,roleName_cz,roleDescription_cz);

    }

    @Override
    public void ScarpUpdateZz(int id) {
        iScrapDao.ScarpUpdateZz(id);
    }

    @Override
    public void ScarpUpdateJYy(int id) {
     iScrapDao.ScarpUpdateJYy(id);
    }

    @Override
    public void ScarpUpdateJSY(int id) {
     iScrapDao.ScarpUpdateJSY(id);
    }

    @Override
    public void ScarpUpdateZLJS(int id) {
     iScrapDao.ScarpUpdateZLJS(id);
    }

    @Override
    public void ScarpUpdateCZ(int id) {
     iScrapDao.ScarpUpdateCZ(id);
    }


}