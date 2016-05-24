package com.dbyl.libarary.action;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

/**
 * 为浏览器加上Session
 * @author 700sfriend
 *
 */
public class actionDriverCookie {
	
	public static WebDriver addCookie(WebDriver driver){
		Cookie homePageCookie;
		
		homePageCookie = actionGetCookie.ActGetCookie(driver);
		
		System.out.println("浏览器默认加上Session");
		driver.manage().addCookie(homePageCookie);
		return  driver;
		
	}
		

}
