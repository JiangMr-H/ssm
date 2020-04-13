/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: mail
 * Author:   891649
 * Date:     2020/4/13 11:16
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
 * 〈〉
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Data
public class mail {

    private Integer id;

    private String userId; // 登录账号

    private String username; //邮箱号

    private String password;  //密码

    private mailBox mailBoxes;

    private Date time;



}