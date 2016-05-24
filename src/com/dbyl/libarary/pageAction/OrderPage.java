package com.dbyl.libarary.pageAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.Locator;
import com.dbyl.libarary.utils.Log;

public class OrderPage {
	
	protected static Log log = new Log(null);
	
	static WebDriver OrderDriver;
	static JavascriptExecutor jse; 
	
	
	/**
	 * 结算页里的Action
	 * @param driver
	 */
	public static void subToOrder(WebDriver driver) {
		// TODO Auto-generated method stub
		
		OrderDriver = driver;
		jse= (JavascriptExecutor)driver; 
		
//		点击结算页“提交”按钮；
		subOrder();
//		获取支付页面文案；
		TextPayPage();
//		检查是否提交成功；
		checkOrder();
//		进入订单详情页
		PageOrderDetails();
//		获取订单号；
		getOrderNum();
	}


	/**
	 * action:提交订单
	 * @param driver
	 */
	private static void subOrder() {
		// TODO Auto-generated method stub
		System.out.println("已经进入结算页面");
		WebElement ButtonSubOrder = OrderDriver.findElement(By.xpath(".//*[@id='submitsection']"));
		ButtonSubOrder.click();
		jse.executeScript("arguments[0].click();", ButtonSubOrder); 
	}
	
	/**
	 * action:进入支付页面，获取支付页面的提示文案
	 * @param driver
	 * @return
	 */
	 
	private static WebElement TextPayPage() {
		// TODO Auto-generated method stub
		WebElement PageTextPay = OrderDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnPay']"));
		return PageTextPay;
	}
	
	
	/**
	 * action:通过支付页面的文案，判断是否提交成功。
	 * @param driver
	 */
		
	private static void checkOrder() {
		// TODO Auto-generated method stub
		if(TextPayPage()!=null){
			System.out.println("提交成功！");
		}else{
			System.out.println("订单提交失败！");
		}
	}
	
	
	/**
	 * 进入订单详情页
	 */
	public static void PageOrderDetails(){
		// TODO Auto-generated method stub
		System.out.println("进入订单详情页");
		WebElement OrderDetails = OrderDriver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div/a"));
		OrderDetails.click();
		System.out.println("订单详情页进入成功");
		
	}
		
		/**
		 * 获取订单号
		 * @param driver
		 */	
		public static String getOrderNum() {
			// TODO Auto-generated method stub
			WebElement OrderNum = OrderDriver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div/ul/li[4]/strong"));
			String Ordernum = OrderNum.getText();
			System.out.println("订单号："+Ordernum);
//			log.info(Ordernum);
			return Ordernum;
			
		}


		public static String getOrderNum(WebDriver driver) {
			// TODO Auto-generated method stub
			return null;
		}




}
