package com.gree.day02.utils;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * ÍâÍø·¢ËÍÓÊ¼ş
 */
public class SendTextMails {

    public static void SendTextMail(String addresser,String password,String recipients,String copyRecipients,String title,String mainText)throws Exception{

        String smtpHost = "172.89.1.105";
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", smtpHost);
        props.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(addresser));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
        message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(copyRecipients));
        message.setSentDate(new Date());
        message.setSubject(title);
        message.setText(mainText);
        message.saveChanges();
        session.setDebug(true);
        Transport transport = session.getTransport("smtp");
        transport.connect(addresser,password);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();

    }
}
