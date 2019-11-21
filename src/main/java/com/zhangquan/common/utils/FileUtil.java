package com.zhangquan.common.utils;
/**
 * 文件工具类
 * @author Lenovo
 *
 */
public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		String sub = fileName.substring(fileName.length()-4, fileName.length());
		return sub;
	}
}
