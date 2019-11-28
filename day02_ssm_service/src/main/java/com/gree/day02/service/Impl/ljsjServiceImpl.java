/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ljsjServiceImpl
 * Author:   891649
 * Date:     2019/11/27 8:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.day02.dao.IljsjDao;
import com.gree.day02.dao.Lsjb;
import com.gree.day02.service.ILjsjService;
import com.gree.day02.service.ILsjbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/11/27
 * @since 1.0.0
 */
@Service
@Transactional
public class ljsjServiceImpl implements ILjsjService {

    @Autowired
    private IljsjDao iljsjDao;

    @Override
    public List<Lsjb> findAllljsj(int page, int size) {
        PageHelper.startPage(page,size);
        return iljsjDao.findAllljsj();
    }

    @Override
    public void saveLjsj(Lsjb lsjb) {
        iljsjDao.saveLjsj(lsjb);
    }

    @Override
    public List<Lsjb> findZKSK(int page, int size) {
        PageHelper.startPage(page,size);
        return iljsjDao.findZKSK();
    }


    @Override
    public  Lsjb findljsjbById(int id) {

        return iljsjDao.findljsjbById(id);
    }

    @Override
    public void updateZKSK(int id, String SJJL) {
         iljsjDao.updateZKSK(id,SJJL);
    }
}