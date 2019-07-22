package commonUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class BrowserFactory {
	static WebDriver driver=null;
	static NgWebDriver ngdriver;
	static final String chromeExpectedBrowser="chrome";
	public static WebDriver browserSetup(String browsername, String url)
	{
		
		if(browsername.equalsIgnoreCase(chromeExpectedBrowser))
		{
		
			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			ngdriver = new NgWebDriver((JavascriptExecutor) driver);
				
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			ngdriver = new NgWebDriver((JavascriptExecutor) driver);
			
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			ngdriver = new NgWebDriver((JavascriptExecutor) driver);
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	

}
