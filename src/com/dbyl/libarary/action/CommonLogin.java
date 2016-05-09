package com.dbyl.libarary.action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dbyl.libarary.pageAction.HomePage;
import com.dbyl.libarary.pageAction.LoginPage;
import com.dbyl.libarary.utils.PageFactory;


/**
 * 这是个什么类？
 * @author 700sfriend
 *
 */
public class CommonLogin {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	static LoginPage loginPage;

	/**
	 * @author 700sfriend
	 * 这是一个有参数的方法
	 * 正常的登录操作
	 * 这个方法，封装的是：详细处理了登陆的操作！
	 * 
	 * @param email
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public static HomePage login(String email, String password)
			throws Exception {
		loginPage = new LoginPage(driver);
		loginPage.waitForPageLoad();
		loginPage.typeEmailInputBox(email);
		loginPage.typePasswordInputBox(password);
		loginPage.clickOnLoginButton();
		//判断当前页面是否为true
		Assert.assertTrue(loginPage.isPrestentProfile(), "login failed");
		return (HomePage) PageFactory.getPage(HomePage.class, getDriver());
	}
/**
 * @author 700sfriend
 * 这里是个无参的方法
 * 返回一个HomePage类型
 * @return
 * @throws Exception
 */
	public static HomePage login() throws Exception {
//		在本类调用本类方法，可以专注于接收参数
		return CommonLogin.login("13282774643", "appium123");
	}
/**
 * @author 700sfriend
 *  传递driver
 * @param driver
 */
	public static void setDriver(WebDriver driver) {
		CommonLogin.driver = driver;
	}

}
