/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sendMailServiceImpl
 * Author:   891649
 * Date:     2020/4/13 14:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service.Impl;

import com.gree.day02.dao.IsendMailDao;
import com.gree.day02.dao.mail;
import com.gree.day02.dao.mailBox;
import com.gree.day02.service.ISendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Service
public class sendMailServiceImpl implements ISendMailService {

    @Autowired
    private IsendMailDao sendMailDao;


    @Override
    public mail findMail(String name) {
        mail mail = sendMailDao.findMail(name);
        return mail;
    }

    @Override
    public void addMail(mail mail, mailBox mailBox) {
        sendMailDao.saveMail(mail);
        sendMailDao.saveMailBox(mailBox);
    }


}