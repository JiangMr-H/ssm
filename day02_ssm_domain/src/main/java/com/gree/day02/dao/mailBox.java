/**
 * Copyright (C), 2015-2020, XXX���޹�˾
 * FileName: mailBox
 * Author:   891649
 * Date:     2020/4/13 11:23
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
 * ���ʼ��䡵
 *
 * @author 891649
 * @create 2020/4/13
 * @since 1.0.0
 */
@Data
public class mailBox {

    private Integer id;

    private Integer mailId;   //����id

    private String title;    //����

    private String mainText;  //����

    private String addresser;  //������

    private String recipients;  //�ռ���

    private String copyRecipients;//������

    private Date sernTime;  //����ʱ��

    private Date inputTime; //¼��ʱ��


}