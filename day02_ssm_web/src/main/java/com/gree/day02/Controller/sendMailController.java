/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sendMail
 * Author:   891649
 * Date:     2020/4/14 15:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.gree.day02.dao.Mail;
import com.gree.day02.service.ISendMailService;
import com.gree.day02.utils.SendTextMails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/4/14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/mail")
public class sendMailController {

    @Autowired
    private ISendMailService iSendMailService;

    @RequestMapping("/send")
    public void sendMail()throws Exception{

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Mail mail =iSendMailService.findMail(authentication.getName());
        SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
    }


}