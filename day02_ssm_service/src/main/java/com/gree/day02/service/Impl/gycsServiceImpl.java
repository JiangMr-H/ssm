/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: gycsServiceImpl
 * Author:   891649
 * Date:     2019/10/8 9:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.IGycsDao;
import com.gree.day02.dao.Scrap;
import com.gree.day02.service.IGycsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/10/8
 * @since 1.0.0
 */
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

}