package com.amazopompagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Loginpage_InvalidUser {
	public WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement helloSign;
	
	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a/span")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement userNameMobOREmail;
	
	
	@FindBy(id="continue")
	WebElement btnContinue;
	
	@FindBy(xpath ="//h4[contains(text(),'There was a problem')]")
	WebElement invalidUserErrMsg;
	
	public Loginpage_InvalidUser(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void mouseHover() {
		Actions act=new Actions(driver);
		act.moveToElement(helloSign).perform();
	}
	
	public String getinvalidUserErrMsg() {
	String strinvalidUserErrMsg	=invalidUserErrMsg.getText();
	return strinvalidUserErrMsg;
		
	}
	
	public void enterInvalidUserName(String invalidusername) {
		mouseHover();
		signIn.click();
		userNameMobOREmail.sendKeys(invalidusername);
		btnContinue.click();
		
	}
	
	
	
	
	
	
	
	

}
