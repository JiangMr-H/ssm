/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: gycsServiceImpl
 * Author:   891649
 * Date:     2019/10/8 9:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.IGycsDao;
import com.gree.day02.service.IGycsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class gycsServiceImpl implements IGycsService {

    @Autowired
    private IGycsDao iGycsDao;


    @Override
    public List<GYCS> findGycs(int page, int size) {
        PageHelper.startPage(page,size);
        return iGycsDao.findGycs();
    }

    @Override
    public void gycsAdd(GYCS gycs) {
        iGycsDao.gycsAdd(gycs);
    }

    @Override
    public List<GYCS> findGycs2(int page, int size, int count) {
        PageHelper.startPage(page,size);

        return iGycsDao.findGycs2(count);
    }

    @Override
    public GYCS findByTJYId(int scrapId) {
        return iGycsDao.findByTJYId(scrapId);
    }

/*    @Override
    public void insertTJY(int id, String roleName, String roleDesc) {
               iGycsDao.insertTJY(id,roleName,roleDesc);
    }*/


    @Override
    public void GycsUpdate(int id, int count) {
        iGycsDao.GycsUpdate(id,count);
    }

   /* @Override
    public void updateByJC_ZK(int id, String roleName, String roleDesc) throws Exception{
        iGycsDao.updateByJC_ZK(id,roleName,roleDesc);
    }*/

    @Override
    public void updateByJC_GY(int id, String roleName, String roleDesc) throws Exception{
        iGycsDao.updateByJC_GY(id,roleName,roleDesc);
    }

    @Override
    public GYCS findGycsByGyId(int gyId) {
        return iGycsDao.findGycsByGyId(gyId);
    }

    @Override
    public void updateGycsById(int gyId, String yl1, String yl2, String yl3, String yl4, String yl5, String yl6, String yl7, String sd1, String sd2, String sd3, String sd4, String sd5, String sd6, String sd7, String wz1, String wz2, String wz3, String wz4, String wz5, String wz6, String wz7, String wd1, String wd2, String wd3, String wd4, String wd5, String wd6, String wd7, String cpmc, String jyy, String jcbm, String bc, String jcrq, String sj, String lq, String bya, String jcsj, String bz) {
          iGycsDao.updateGycsById(gyId,yl1,yl2,yl3,yl4,yl5,yl6,yl7,sd1,sd2,sd3,sd4,sd5,sd6,sd7,wz1,wz2,wz3,wz4,wz5,wz6,wz7,wd1,wd2,wd3,wd4,wd5,wd6,wd7,cpmc,jyy,jcbm,bc,jcrq,sj,lq,bya,jcsj,bz);
    }

    @Override
    public void saveGycsById(int id, String zKname, String zKdesc) {
        iGycsDao.saveGycsById(id,zKname,zKdesc);
    }

    @Override
    public void insertZK(int id, String roleName, String roleDesc) {
        iGycsDao.insertZK(id,roleName,roleDesc);
    }

    @Override
    public void updateGycsForZK(int id, String roleName, String roleDesc) {
        iGycsDao.updateGycsForZK(id,roleName,roleDesc);
    }

    @Override
    public void updateGycsForGY(int id, String roleName, String roleDesc) {
        iGycsDao.updateGycsForGY(id,roleName,roleDesc);
    }


}