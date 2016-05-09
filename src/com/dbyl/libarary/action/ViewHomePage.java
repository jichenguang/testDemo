/**
 * 
 */
package com.dbyl.libarary.action;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.pageAction.HomePage;

/**
 * 这是一个工厂类，粗略的告诉你要干什么，但是具体的事情还是封装到了下一层
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
	 * @throws Exception
	 */
	public static HomePage viewMyProfile() throws Exception {

		CommonLogin.setDriver(driver);
//		正常的登录
		homePage = CommonLogin.login();
//		homePage = CommonLogin.login("13282774643", "appium123");
//		登录后切换到“我的主页”
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
