package com.amazompom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	WebDriver driver;
	By helloSign=By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]");
	By signIn=By.xpath("//span[contains(text(),'Sign in')]");
	By emailorMobileNumber=By.id("ap_email");
	By continueBtn=By.id("continue");
	By password=By.id("ap_password");
	By signBtn=By.id("signInSubmit");
	By invaliduserNameError=By.xpath("//h4[contains(text(),'Incorrect phone number')]");
	By invalidPasswordError=By.xpath("//h4[contains(text(),'Important Message!')]");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void mouseHover(){
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(helloSign);
		act.moveToElement(ele).perform();
	}
	
	public void clickOnSignIn(){
		driver.findElement(signIn).click();
	}
	
	public void enteruserName(String userName){
		driver.findElement(emailorMobileNumber).sendKeys(userName);
	}
	public void enterPassword(String userPassword){
		driver.findElement(password).sendKeys(userPassword);
	}
	
	public void clickOnContinueBtn(){
		driver.findElement(continueBtn).click();
	}
	
	public String invaliduserNameErrorMess(){
		String actualErrorMesa=driver.findElement(invaliduserNameError).getText();
		System.out.println("actualErrorMesa:-->" + actualErrorMesa);
		return actualErrorMesa;
	}
	
	public void clickOnSignBtn(){
		driver.findElement(signBtn).click();
	}
	
	public String invalidpassworderror(){
		String geterrorpassword=driver.findElement(invalidPasswordError).getText();
		return geterrorpassword;
	}
	
	
	

}
