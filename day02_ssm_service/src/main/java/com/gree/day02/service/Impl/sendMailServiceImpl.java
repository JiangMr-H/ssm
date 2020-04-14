package com.gree.day02.service.Impl;

import com.gree.day02.dao.IsendMailDao;
import com.gree.day02.dao.Mail;
import com.gree.day02.service.ISendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sendMailServiceImpl implements ISendMailService {

    @Autowired
    private IsendMailDao sendMailDao;


    @Override
    public Mail findMail(String name) {
        Mail mail = sendMailDao.findMail(name);
        return mail;
    }

    @Override
    public void addMail(Mail mail) {
        sendMailDao.saveMail(mail);
        sendMailDao.saveMailBox(mail);
    }

    @Override
    public String findUserIdByusername(String name) {
        return sendMailDao.findUserIdByusername(name);
    }

    @Override
    public void updateMail(Mail mail) {
        sendMailDao.updateMail(mail);
    }


}