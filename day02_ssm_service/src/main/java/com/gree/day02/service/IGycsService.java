/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: IGycsService
 * Author:   891649
 * Date:     2019/10/8 9:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.service;

import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.Scrap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ��һ�仰���ܼ�����<br> 
 * ����
 *
 * @author 891649
 * @create 2019/10/8
 * @since 1.0.0
 */

public interface IGycsService {

    List<GYCS> findGycs(int page, int size);

    void gycsAdd(GYCS gycs);

    List<GYCS> findGycs2(int page, int size, int count);

    GYCS findByTJYId(int scrapId);

}