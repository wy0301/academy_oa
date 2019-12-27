package com.woniu.test;

import org.apache.shiro.crypto.hash.SimpleHash;
//生成md5加密后的密码
public class Md5 {
public static void main(String[] args) {
	SimpleHash sh = new SimpleHash("md5", "root", "wnxy",1024);
	String result = sh.toHex();
	System.out.println(result);
}
}
