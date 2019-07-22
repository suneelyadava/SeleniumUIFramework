package com.cumulus.ui.automation.common.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;

import commonUtils.BrowserFactory;
import commonUtils.TestBase;
import cumulusPageObject.CumulusCard;
import cumulusPageObject.CumulusClear;
import cumulusPageObject.LoginPage;
import cumulusPageObject.WaitForPageToLoad;

public class RightActionTest extends TestBase{
	static WebDriver driver;
	static NgWebDriver ngdriver;
	
	
	@BeforeTest
	public void preSetup()
	{
		driver=BrowserFactory.browserSetup("chrome", "https://35.160.167.233:32666/logon");
		
		  
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		
		  WaitForPageToLoad.waitForOneSec();
		  LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		  loginpage.loginPage("admin", "admin");
		  
		  
		  
		  driver.findElement(By.xpath(CumulusClear.clear_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(CumulusCard.card_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(CumulusCard.card_view_BGP_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  String node= driver.findElement(By.xpath("//div[@class='layout-content']//div[1]//div[1]//span[2]")).getText();
		  WaitForPageToLoad.waitForOneSec();
		  int nodes=(Integer)CallTestRest.test();
		  int node2=Integer.parseInt(node);
		  assertEquals(nodes, node2);
		 
		 
		  
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
