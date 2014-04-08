package com.instcar.android.config;

public class Config {

	
	public static String HTTPCODESUCCESS="200";
	
	public static String BASEURL="http://qd00.shopbigbang.com:8086/";
	
	
	public static String getBaseUrl(){
		
		return BASEURL;
	}
	/*
	 * 用户手机号码验证
	 */
	public static String apiuserCheckUserPhone(){
		
		return BASEURL+"server/user/checkuserphone";
	}
	
	/*
	 * 验证用户名是否有效
	 */
	public static String apiserverusercheckusername(){
		
		return BASEURL+"server/user/checkusername";
	}
	/*
	 *  用户获取短信验证码
	 */
	public static String apiserverusergetauthcode(){
		
		return BASEURL+"server/user/getauthcode";
	}
	
	/*
	 *  用户注册
	 */
	public static String apiserveruserregister(){
		
		return BASEURL+"server/user/register";
	}
	
	/*
	 *  用户登陆
	 */
	public static String apiserveruserlogin(){
		
		return BASEURL+"server/user/login";
	}
	/*
	 *  用户详细信息获取
	 */
	public static String apiserveruserdetail(){
		
		return BASEURL+"server/user/detail";
	}
	
	
	
	
}
