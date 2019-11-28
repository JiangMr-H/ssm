/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: Course
 * Author:   891649
 * Date:     2019/8/16 11:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

package com.gree.day02.dao;

/**
 * @author 891649
 * @create 2019/8/16
 * @since 1.0.0
 */
public class Course {
      private int id;
      private String currentProcess;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentProcess() {
        return currentProcess;
    }

    public void setCurrentProcess(String currentProcess) {
        this.currentProcess = currentProcess;
    }
}