/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SendTextMail
 * Author:   891649
 * Date:     2020/4/13 10:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
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
 * 外网发送邮件
 */
public class SendTextMail {
    public static void main(String[] args) throws Exception {
        String from = "891649@gree.com.cn";
        String to = "891649@gree.com.cn";
        String subject = "I am iron man";//标题
        String body = "iron ge  tou ";
        String smtpHost = "172.89.1.105";//smtp.qq.com/smtp.sohu.com
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp"); // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", smtpHost); // 发件人的邮箱的 SMTP服务器地址
        props.setProperty("mail.smtp.auth", "true"); // 请求认证，参数名称与具体实现有关
        // 创建Session实例对象
        Session session = Session.getDefaultInstance(props);
        // 创建MimeMessage实例对象
        MimeMessage message = new MimeMessage(session);
        // 设置发件人
        message.setFrom(new InternetAddress(from));
        // 设置收件人
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        // 设置发送日期
        message.setSentDate(new Date());
        // 设置邮件主题
        message.setSubject(subject);
        // 设置纯文本内容的邮件正文
        message.setText(body);
        // 保存并生成最终的邮件内容
        message.saveChanges();
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
        // 获取Transport对象
        Transport transport = session.getTransport("smtp");
        // 第2个参数需要填写的是QQ邮箱的SMTP的授权码，什么是授权码，它又是如何设置？
        transport.connect(from,"qwe!23");
        // 发送，message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
