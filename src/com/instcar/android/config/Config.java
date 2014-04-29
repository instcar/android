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
	
	/*
	 *  用户详细信息获取
	 */
	public static String apiserveruseredit(){
		
		return BASEURL+"server/user/edit";
	}
	
	/*
	 *  增加car
	 */
	public static String apiserveruseraddcar(){
		
		return BASEURL+"server/user/addcar";
	}
	
	/*
	 *  获取car
	 */
	public static String apiserverusergetcars(){
		
		return BASEURL+"server/user/getcars";
	}
	
	/*
	 *  实名认证
	 */
	public static String apiserveruserrealnamerequest(){
		
		return BASEURL+"server/user/realnamerequest";
	}
	
	
	/*
	 *  实名认证
	 */
	public static String apiserveruserlogout(){
		
		return BASEURL+"server/user/logout";
	}
	
	/*
	 *  
	 */
	public static String apiserverimageupload(){
		
		return BASEURL+"server/image/upload";
	}
	
	
	/*
	 *   根据品牌查询汽车
	 */
	public static String apiservercarlist(){
		
		return BASEURL+"server/car/list";
	}
	
	
	
	
}
