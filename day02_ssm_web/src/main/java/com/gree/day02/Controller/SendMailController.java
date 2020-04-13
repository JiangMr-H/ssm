/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SendMailController
 * Author:   891649
 * Date:     2020/4/13 14:22
 * Description: 发送邮箱
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.Controller;

import com.gree.day02.dao.mail;
import com.gree.day02.dao.mailBox;
import com.gree.day02.service.ISendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br>
 * 〈发送邮箱〉
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Controller
@RequestMapping("/mail")
public class SendMailController {

    @Autowired
    private ISendMailService iSendMailService;

    /**
     * 根据登录的账号查邮箱设置信息
     *
     * @return
     */
    @RequestMapping("/find.do")
    public ModelAndView MailforText() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView mv = new ModelAndView();
        mail mail = iSendMailService.findMail(authentication.getName());

        mv.addObject("mail", mail);
        mv.setViewName("email");
        return mv;
    }

    @RequestMapping("/add.do")
    @Transactional
    public String addMail(mail mail, mailBox mailBox){

        iSendMailService.addMail(mail,mailBox);
        return "redirect:find.do";
    }


}