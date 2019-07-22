package com.cumulus.ui.automation.common.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularOptions;
import com.paulhammant.ngwebdriver.ByAngularRepeater;
import com.paulhammant.ngwebdriver.NgWebDriver;

import commonUtils.BrowserFactory;
import commonUtils.TestBase;
import cumulusPageObject.*;

public class CumulusUITest{
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
		  driver.findElement(By.xpath(CumulusCard.card_view_xpath)).isDisplayed();
		  
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(CumulusCard.card_view_alarm_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(CumulusCard.card_xpath)).click();
		  
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(CumulusCard.card_view_events_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(UserLogOut.userProfile_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  driver.findElement(By.xpath(UserLogOut.user_LogOut_xpath)).click();
		  WaitForPageToLoad.waitForOneSec();
		  
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		 driver.quit();
	}

}
