package com.dbyl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dbyl.libarary.action.ViewHomePage;
import com.dbyl.libarary.utils.DriverFactory;
import com.dbyl.libarary.utils.TestNGListener;
import com.dbyl.libarary.utils.UITest;




@Listeners({ TestNGListener.class })
public class loginTest extends UITest {

//	注释掉，使用默认浏览器。
//	WebDriver driver = DriverFactory.getChromeDriver();
	WebDriver driver = new FirefoxDriver();
//	WebDriver driver = new ChromeDriver();

	@BeforeMethod(alwaysRun = true)
	public void init() {		
		super.init(driver);
		ViewHomePage.setDriver(driver);
	}

	@Test(groups = "loginTest")
	public void loginByUserName() throws Exception {
		ViewHomePage.viewMyProfile();
	}

	@AfterMethod(alwaysRun = true)
	public void stop() {
		super.stop();
	}

}
