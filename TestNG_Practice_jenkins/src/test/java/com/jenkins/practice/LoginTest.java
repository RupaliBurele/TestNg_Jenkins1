package com.jenkins.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	public 	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\core java classes\\Softwares\\Selenium\\chrome\\chromedriver.exe");

		 driver=new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void login1() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("www123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("wwwww123");
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		System.out.println("title of page:"+driver.getTitle());
		
	}
	
	/*@AfterMethod
	public void end() {
		driver.close();
	}*/

}
