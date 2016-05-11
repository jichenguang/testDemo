package com.dbyl.libarary.pageAction;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;

/**
 * 描述了主页的操作业务
 * HomePage到底是个啥东西？
 * ？是否是包含了页面的元素的一个类
 * 具体的一个页面类，可以使用BasePage的方法。
 * 被Action 类调用
 * @author 700sfriend
 *
 */
public class HomePage extends BasePage {
	private Locator profile=new Locator("html/body/div[1]/div/div/div[3]");
	private Locator myMainPage= new Locator("myMainPage");
	public HomePage(WebDriver driver) throws Exception {
		super(driver);
	}
	
	/**
	 * @author 700sfriend
	 * 定位元素
	 * @throws Exception
	 */
	public void clickOnMyProfile() throws Exception
	{
		click(profile);
	}
	
	/**
	 * @author 700sfriend
	 * 鼠标悬停在头像图片上，既不点击并且不释放
	 * @throws Exception
	 */
	
	public void clickAndHoldProfile() throws IOException
	{
		clickAndHold(profile);
	}
	
	/**
	 * @author 700sfriend
	 * 登陆后的操作
	 * 内含两个方法
	 * 鼠标操作
	 * http://www.ibm.com/developerworks/cn/java/j-lo-keyboard/
	 * @throws Exception
	 */
	public void clickOnMainPage() throws Exception
	{	
		System.out.println("悬浮在弹出层");
		clickAndHoldProfile();
		
		System.out.println("￥￥￥￥￥打开我的主页");
		click(myMainPage);
		log.info("跳转到我的主页");
	}
}
