package com.amazopompagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginpagePF {
	public WebDriver driver;

	public LoginpagePF(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement HellosingIn;

	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']/a/span")
	WebElement sigin;

	@FindBy(id="ap_email")
	WebElement eneruserName;

	@FindBy(id="continue")
	WebElement continubtn;

	public void LogInpage(String username){
		WebElement ele=HellosingIn;
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		sigin.click();
		eneruserName.sendKeys(username);
		continubtn.click();
	}




}
