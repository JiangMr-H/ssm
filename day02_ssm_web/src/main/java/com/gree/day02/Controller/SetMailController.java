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

import com.gree.day02.dao.Mail;
import com.gree.day02.service.ISendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

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
public class SetMailController {

    @Autowired
    private ISendMailService iSendMailService;

    /**
     * 根据登录的账号查邮箱设置信息
     *
     * @return
     */
    @RequestMapping("/find.do")
    public ModelAndView MailforText() {
        UserDetails authentication =  (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ModelAndView mv = new ModelAndView();
        Mail mail = iSendMailService.findMail(authentication.getUsername());
        mv.addObject("mail", mail);
        if (mail !=null && !StringUtils.isEmpty(mail) ) {  //已设置邮箱  转入修改界面
            mv.setViewName("update_email");
        }else {                                           //没有设置邮箱  转入设置界面
            mv.addObject("mail", mail);
            mv.setViewName("save_email");
        }
        return mv;
    }

    @RequestMapping("/add.do")
    @Transactional
    public String addMail(Mail mail){
        UserDetails authentication =  (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userId =iSendMailService.findUserIdByusername(authentication.getUsername());
        mail.setUserId(userId);
        mail.setUsername(authentication.getUsername());
        iSendMailService.addMail(mail);
        return "redirect:find.do";
    }


    @RequestMapping("/update.do")
    @Transactional
    public String updateMail(Mail mail,HttpServletResponse response){
        UserDetails authentication =  (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userId =iSendMailService.findUserIdByusername(authentication.getUsername());
        mail.setUserId(userId);
        mail.setUsername(authentication.getUsername());
        iSendMailService.updateMail(mail);
        return "messages";
    }

}