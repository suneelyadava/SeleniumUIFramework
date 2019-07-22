package cumulusPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
	
	static final String loginuser_xpath="html/body/hzn-root/hzn-logon/div/hzn-enter-username/section/kui-input-box/form/kui-input/div/input";
    static final String clickOkUser_name="username";
    static final String loginPwd_tagName="input";
    static final String clickOkPwd_name="password";
    static String baseurl="https://35.160.167.233:32666/logon";
    static WebDriver driver;
    
    /*Find By elements*/
    @FindBy(xpath = loginuser_xpath)
    WebElement username;
    
    @FindBy(name = clickOkUser_name)
    WebElement clickEnterUsername;
    @FindBy(tagName = loginPwd_tagName)
    WebElement password;
    @FindBy(name = clickOkPwd_name)
    WebElement clickEnterPassword;
    
    public LoginPage(WebDriver ldriver) {
    	this.driver=ldriver;
    	
    }
    public void loginPage(String user, String pwd) throws InterruptedException
    {
    	username.sendKeys(user);
    	WaitForPageToLoad.waitForFiveSec();
    	clickEnterUsername.click();
    	WaitForPageToLoad.waitForFiveSec();
    	password.sendKeys(pwd);
    	WaitForPageToLoad.waitForFiveSec();
    	clickEnterPassword.click();
    	WaitForPageToLoad.waitForFiveSec();
    	
    	
    	
    	
    }
    
   
    
    
    
}
