package com.dbyl.libarary.pageAction;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;


public class HomePage extends BasePage {
	private Locator profile=new Locator("//div[@class='top-nav-profile']");
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
	 * 定位元素
	 * @throws Exception
	 */
	
	public void clickAndHoldProfile() throws IOException
	{
		clickAndHold(profile);
	}
	
	/**
	 * @author 700sfriend
	 * 登陆后的操作
	 * 内涵两个方法
	 * @throws Exception
	 */
	public void clickOnMainPage() throws Exception
	{
		clickAndHoldProfile();
		click(myMainPage);
	}
}
