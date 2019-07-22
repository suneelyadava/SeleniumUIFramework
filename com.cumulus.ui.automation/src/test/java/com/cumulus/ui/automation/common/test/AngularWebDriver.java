package com.cumulus.ui.automation.common.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class AngularWebDriver {
	
	static WebDriver driver;
	 static NgWebDriver ngdriver;
	@Test
	public void test() throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		  driver = new ChromeDriver();

		  //Sample AngularJs Webpage
		  driver.get("https://hello-angularjs.appspot.com/sorttablecolumn");
		  driver.manage().window().maximize();

		   //Creating an instance of NgWebDriver
		  ngdriver = new NgWebDriver((JavascriptExecutor) driver);
		  
		  driver.findElement(ByAngular.model("name")).sendKeys("Test Company");
		  driver.findElement(ByAngular.model("employees")).sendKeys("1000");
		  driver.findElement(ByAngular.model("headoffice")).sendKeys("Mysore");
		  driver.findElement(ByAngular.buttonText("Submit")).click();
		  
		  Thread.sleep(2000);
		  String txt = driver.findElement(ByAngular.repeater("company in companies").row(4).column("name")).getText();
		  System.out.println(txt + " Added.");
		  
		  if(txt.equalsIgnoreCase("Test Company")){
		   System.out.println("New Company Added. Now remove it");
		   driver.findElement(ByAngular.repeater("company in companies").row(4)).findElement(ByAngular.buttonText("Remove")).click();
		  }

		   Thread.sleep(3000);
		  driver.quit();
		
	}
 
}