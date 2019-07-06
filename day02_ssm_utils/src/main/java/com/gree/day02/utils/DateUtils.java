package com.gree.day02.utils; /**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DateUtils
 * Author:   891649
 * Date:     2019/7/2 16:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/2
 * @since 1.0.0
 */
public class DateUtils {
       //日期转换为字符串
    public static String data2String(String str, Date date){
        SimpleDateFormat sdf=new SimpleDateFormat(str);
        String format =sdf.format(date);
        return format;
    }

    //字符串转换为日期
    public static Date string2Date(String str,String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(str);
        Date parse =sdf.parse(date);
         return parse;
    }
}