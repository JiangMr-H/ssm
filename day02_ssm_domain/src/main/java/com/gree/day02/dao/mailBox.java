/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: mailBox
 * Author:   891649
 * Date:     2020/4/13 11:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.dao;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈邮件箱〉
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Data
public class mailBox {

    private Integer id;

    private Integer mailId;   //邮箱id

    private String title;    //标题

    private String mainText;  //正文

    private String addresser;  //发件人

    private String recipients;  //收件人

    private String copyRecipients;//抄送人

    private Date sernTime;  //发送时间

    private Date inputTime; //录入时间


}