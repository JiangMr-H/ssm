/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: lsjbService
 * Author:   891649
 * Date:     2019/10/9 3:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.day02.dao.ILsjbDao;
import com.gree.day02.dao.Lsjb;
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
 * @create 2019/10/9
 * @since 1.0.0
 */
@Service
@Transactional
public class lsjbServiceImpl implements ILsjbService {

    /*@Autowired
    private ILsjbDao iLsjbDao;

    @Override
    public List<Lsjb> findLsjb(int page, int size) {
        PageHelper.startPage(page,size);
        return iLsjbDao.findLsjb();

    }

    @Override
    public void lsjbAdd(Lsjb lsjb) {
      iLsjbDao.addLsjb(lsjb);
    }*/
}