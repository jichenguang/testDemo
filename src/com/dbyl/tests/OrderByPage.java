package com.dbyl.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.pageAction.OrderPage;

public class OrderByPage {

	public static void cancleOrder(WebDriver driver) {
		// TODO Auto-generated method stub
		String OrderByUrl =  "http://user.700store.com/orderlist"; 
		driver.get(OrderByUrl);
		
		String ListOrderNum = driver.findElement(By.xpath(".//*[@id='orderList']/div[1]/div[1]/span")).getText();
		
		if(ListOrderNum == OrderPage.getOrderNum(driver)){
			WebElement ButtonOrderDetails = driver.findElement(By.xpath(".//*[@id='orderList']/div[1]/div[4]/div[3]/a"));
			ButtonOrderDetails.click();
			
			WebElement ButtonOrderCancle = driver.findElement(By.xpath(".//*[@id='btnCancelOrder']"));
			ButtonOrderCancle.click();
		}
	}

}
