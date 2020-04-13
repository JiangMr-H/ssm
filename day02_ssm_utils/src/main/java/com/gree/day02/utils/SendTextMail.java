/**
 * Copyright (C), 2015-2020, XXX���޹�˾
 * FileName: SendTextMail
 * Author:   891649
 * Date:     2020/4/13 10:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * ���������ʼ�
 */
public class SendTextMail {
    public static void main(String[] args) throws Exception {
        String from = "891649@gree.com.cn";
        String to = "891649@gree.com.cn";
        String subject = "I am iron man";//����
        String body = "iron ge  tou ";
        String smtpHost = "172.89.1.105";//smtp.qq.com/smtp.sohu.com
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp"); // ʹ�õ�Э�飨JavaMail�淶Ҫ��
        props.setProperty("mail.smtp.host", smtpHost); // �����˵������ SMTP��������ַ
        props.setProperty("mail.smtp.auth", "true"); // ������֤���������������ʵ���й�
        // ����Sessionʵ������
        Session session = Session.getDefaultInstance(props);
        // ����MimeMessageʵ������
        MimeMessage message = new MimeMessage(session);
        // ���÷�����
        message.setFrom(new InternetAddress(from));
        // �����ռ���
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        // ���÷�������
        message.setSentDate(new Date());
        // �����ʼ�����
        message.setSubject(subject);
        // ���ô��ı����ݵ��ʼ�����
        message.setText(body);
        // ���沢�������յ��ʼ�����
        message.saveChanges();
        // ����Ϊdebugģʽ, ���Բ鿴��ϸ�ķ��� log
        session.setDebug(true);
        // ��ȡTransport����
        Transport transport = session.getTransport("smtp");
        // ��2��������Ҫ��д����QQ�����SMTP����Ȩ�룬ʲô����Ȩ�룬������������ã�
        transport.connect(from,"qwe!23");
        // ���ͣ�message.getAllRecipients() ��ȡ�������ڴ����ʼ�����ʱ��ӵ������ռ���, ������, ������
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
