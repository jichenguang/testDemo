/**
 * 
 */
package com.dbyl.libarary.action;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.pageAction.HomePage;

/**
 * 这是一个工厂类，粗略的告诉你要干什么，但是具体的事情还是封装到了下一层
 * 这个类表达了，测试步骤。
 * @author Young
 *
 */
public class ViewHomePage {

	private static WebDriver driver;
	private static HomePage homePage;

	public static WebDriver getDriver() {
		return driver;
	}

	/**
	 * @author 700sfriend
	 * 1、切换到登录
	 * 2、登录
	 * 3、切换到我的主页
	 * ！使用了两个xml文件。一个是LoginPage.xml,使用loginpage类调用；另一个是HomePage.xml,使用HomePage类调用
	 * @throws Exception
	 */
	public static HomePage viewMyProfile() throws Exception {

		CommonLogin.setDriver(driver);
		
//		正常的登录
		homePage = CommonLogin.login();
				
//		登录后切换到“我的主页”
		System.out.println("！！跳转到我的主页");
		homePage.clickOnMainPage();
		return homePage;
	}

	/**
	 * @author 700sfriend
	 * 传一个参数，作为指定的浏览器启动
	 * @param driver
	 */
	public static void setDriver(WebDriver driver) {
		ViewHomePage.driver = driver;
	}

}
