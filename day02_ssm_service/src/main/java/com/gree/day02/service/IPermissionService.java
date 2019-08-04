/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IPermissionService
 * Author:   891649
 * Date:     2019/7/10 16:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.service;

import com.gree.day02.dao.Permission;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/10
 * @since 1.0.0
 */
public interface IPermissionService {

    public List<Permission> findAll()throws Exception;

    public void save(Permission permission)throws Exception;
}