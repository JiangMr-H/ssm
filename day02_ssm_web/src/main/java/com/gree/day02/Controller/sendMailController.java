package com.gree.day02.Controller;

import com.gree.day02.dao.Mail;
import com.gree.day02.service.ISendMailService;
import com.gree.day02.utils.SendTextMails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mail")
public class sendMailController {

    @Autowired
    private ISendMailService iSendMailService;

    @RequestMapping("/send")
    public void sendMail()throws Exception{

        UserDetails authentication =  (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Mail mail =iSendMailService.findMail(authentication.getUsername());
        SendTextMails.SendTextMail(mail.getAddresser(),mail.getMailPwd(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
    }


}