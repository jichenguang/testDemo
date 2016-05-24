package com.dbyl.libarary.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.python.modules.thread.thread;

import com.thoughtworks.selenium.Wait;

public class cartPage {
		
	
	static LoginPage loginPage;
	static WebDriver cartDriver; 
	static JavascriptExecutor jse; 
	
		public static void ActionCart(WebDriver driver) throws InterruptedException{
			cartDriver = driver;
			jse= (JavascriptExecutor)driver; 
			
//			购物车流程
			openProduct();
			checkSellOnce();
			ButtonAddCart();
			CartSuccess();
			checkOverCart();
			ToCart();
			CartToOrder();

			
			
		}
	
		/**
		 * action:打开商品页
		 * @param driver
		 */
		public static  void openProduct() {
			// TODO Auto-generated method stub
	//		进入后街页面		
			String houjieUrl = "http://www.700store.com/houjie";
			cartDriver.get(houjieUrl);
	
		}
	
		/**
		 * action:立即购买
		 * @throws InterruptedException 
		 */
		
		public static void checkSellOnce() throws InterruptedException {
			// TODO Auto-generated method stub
			cartDriver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/a")).findElement(By.xpath("..")).click();
			WebElement SellOnceButton = cartDriver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/a"));		
//			SellOnceButton.click();
//			我用click死活不行，换了JS就好了。
			jse.executeScript("arguments[0].click();", SellOnceButton);  
			if(SellOnceButton!=null){
				System.out.println("找到了");
			}

						
			
		}
		
		/**
		 * action:加入购物车
		 * @param driver
		 * @throws InterruptedException 
		 */
		public static void ButtonAddCart() throws InterruptedException{
			System.out.println("点击“加入购物车”");	
			WebElement addcartButton = cartDriver.findElement(By.xpath(".//*[@id='add_cart']"));
//			addcartButton.click();
			jse.executeScript("arguments[0].click();", addcartButton);  
		}
		
		
		
		/**
		 * action:加入购物车成功页
		 * @param cartDriver
		 */
		public static WebElement CartSuccess() {
		// TODO Auto-generated method stub
			WebElement checkText = cartDriver.findElement(By.xpath("html/body/div[2]/div[1]/div/p[2]"));
			return checkText;
		   
	}
		
		/**
		 *  action:判断是否加入成功
		 * 
		 */

		public static void checkOverCart() {
		// TODO Auto-generated method stub
			if(CartSuccess()!=null){
				System.out.println("加入购物车成功");
			}
	}
		
		/**
		 * action:进入购物车
		 * @param driver
		 */

		public static void ToCart() {
		// TODO Auto-generated method stub
			System.out.println("点击“去购物车”");
			WebElement ButtonToCart = cartDriver.findElement(By.xpath(".//*[@id='toCheckOut']"));
//			ButtonToCart.click();
			jse.executeScript("arguments[0].click();", ButtonToCart); 
			
	}
		
		/**
		 * action:从购物车去结算页
		 * @param driver
		 * @throws InterruptedException 
		 */

		public static void CartToOrder() throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.println("点击“去结算”");
			WebElement ButtonCartToOrder = cartDriver.findElement(By.xpath(".//*[@id='linkToPayPage']"));
			ButtonCartToOrder.click();
			jse.executeScript("arguments[0].click();", ButtonCartToOrder); 
	}
}
