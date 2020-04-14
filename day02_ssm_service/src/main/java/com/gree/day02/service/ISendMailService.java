package com.gree.day02.service;

import com.gree.day02.dao.Mail;

public interface ISendMailService {


    Mail findMail(String name);

    void addMail(Mail mail);

    String findUserIdByusername(String name);

    void updateMail(Mail mail);
}
