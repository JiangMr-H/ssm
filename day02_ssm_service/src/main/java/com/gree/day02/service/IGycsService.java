/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: IGycsService
 * Author:   891649
 * Date:     2019/10/8 9:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.service;

import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.Scrap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 891649
 * @create 2019/10/8
 * @since 1.0.0
 */

public interface IGycsService {

    List<GYCS> findGycs(int page, int size);

    void gycsAdd(GYCS gycs);

    List<GYCS> findGycs2(int page, int size, int count);

    GYCS findByTJYId(int scrapId);

    //void insertTJY(int id, String roleName, String roleDesc);

    void GycsUpdate(int id, int count);

    //void updateByJC_ZK(int id, String roleName, String roleDesc)throws Exception;

    void updateByJC_GY(int id, String roleName, String roleDesc)throws Exception;

    GYCS findGycsByGyId(int gyId);


    void updateGycsById(int gyId, String yl1, String yl2, String yl3, String yl4, String yl5, String yl6, String yl7, String sd1, String sd2, String sd3, String sd4, String sd5, String sd6, String sd7, String wz1, String wz2, String wz3, String wz4, String wz5, String wz6, String wz7, String wd1, String wd2, String wd3, String wd4, String wd5, String wd6, String wd7, String cpmc, String jyy, String jcbm, String bc, String jcrq, String sj, String lq, String bya, String jcsj, String bz);

    void saveGycsById(int id, String zKname, String zKdesc);

    void insertZK(int id, String roleName, String roleDesc);

    void updateGycsForZK(int id, String roleName, String roleDesc);

    void updateGycsForGY(int id, String roleName, String roleDesc);
}