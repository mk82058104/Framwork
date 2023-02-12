package com.amazopompagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPageInvalid {
	
	public WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement hellosign;
	
	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a/span")
	WebElement signInBtn;
	
	@FindBy(id="ap_email")
	WebElement userName;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signBtnsub;
	
	@FindBy(xpath = "//h4[contains(text(),'There was a problem')]")
	WebElement invalidpassErroMsg;
	
	
	
	
	public LoginPageInvalid(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void mouseHoverSign() {
		
		Actions act=new Actions(driver);
		act.moveToElement(hellosign).perform();
		
	}
	
	public void clickOnSignBtn() {
		signInBtn.click();
	}
	
	public void loginApp(String username,String pass) {
		userName.sendKeys(username);
		continueBtn.click();
		password.sendKeys(pass);
		signBtnsub.click();
		
	}
	
	public String getErrMsgForInvalidPass() {
	String geterrms=invalidpassErroMsg.getText();
	return geterrms;
	}
	
	
	

}
