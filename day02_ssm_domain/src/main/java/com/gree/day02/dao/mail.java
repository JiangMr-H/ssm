/**
 * Copyright (C), 2015-2020, XXX���޹�˾
 * FileName: mail
 * Author:   891649
 * Date:     2020/4/13 11:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.dao;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * ��һ�仰���ܼ�����<br> 
 * ����
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Data
public class mail {

    private Integer id;

    private String userId; // ��¼�˺�

    private String username; //�����

    private String password;  //����

    private mailBox mailBoxes;

    private Date time;



}