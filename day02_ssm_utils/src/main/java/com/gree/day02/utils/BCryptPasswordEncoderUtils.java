/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BCryptPasswordEncoderUtils
 * Author:   891649
 * Date:     2019/7/9 13:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.day02.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/9
 * @since 1.0.0
 */
public class BCryptPasswordEncoderUtils {
    private  static BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[]arg) {
        String password ="123";
        String pwd =encodePassword(password);
        System.out.println(pwd);
        //$2a$10$IZaN62hd8GXcGJMci0jvcujBCD7F4YrYGkuCi9fKv/kz5TmwpR9Ka
        //$2a$10$E.ciZFNfbdj9pV8nMGfMNeyO62k.Pw4amaZnFQ4VW9nEcCz9UZ83C
    }


}