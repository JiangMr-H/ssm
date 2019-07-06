/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IUserDao
 * Author:   891649
 * Date:     2019/7/6 10:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.dao;

import org.apache.ibatis.annotations.Select;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/6
 * @since 1.0.0
 */
public interface IUserDao {

    @Select("select * from users where username=#{username}")
    public UserInfo findByUsername(String username)throws Exception;
}