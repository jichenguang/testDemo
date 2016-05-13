package com.dbyl.libarary.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

/**
 * Case:
 * 获取Session
 * @author 700sfriend
 *
 */
public class GetSessionByJi {
	
	
	public static  Cookie getCookie(WebDriver Driver) {
		
		 Cookie Session;
		 
		 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Session = Driver.manage().getCookieNamed("ASP.NET_SessionId");	 
		 System.out.println("获取的用户为:" + Session.getValue());
		 
		 return Session;
	}

}
