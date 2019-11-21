package com.zhangquan.common.utils;

import java.util.Date;


/**
 * 日期工具类
 * @author Lenovo
 *
 */
public class DateUtil {
	public static void main(String[] args) {
		DateUtil util=new DateUtil();
		Date date=new Date();
		util.getDateByFullMonth(date);
	}
	
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		String string = src.toString();
		System.out.println(string);
		
		return src;
	}
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		return src;
	}
	
}
