package com.dbyl.libarary.action;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;


/**
 * 获取Cookie的类。
 * @author 700sfriend
 *
 */
public class actionGetCookie {
	
	/**
	 * 获取Cookie
	 * @param driver
	 * @return homePageCookie 返回获取的Session信息
	 */
	public static Cookie ActGetCookie(WebDriver driver){
		Cookie homePageCookie =  GetSessionByJi.getCookie(driver);
		return homePageCookie;
	}

}
