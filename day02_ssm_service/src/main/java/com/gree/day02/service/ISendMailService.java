package com.gree.day02.service;

import com.gree.day02.dao.mail;
import com.gree.day02.dao.mailBox;

public interface ISendMailService {


    mail findMail(String name);

    void addMail(mail mail, mailBox mailBox);

}
