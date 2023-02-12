package com.amazontestrunner;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazompom.LoginPage;
import com.amazonbusiesslib.CreateDriver;
import com.amazonbusiesslib.GetData;


public class LogInPageTestRunner {
	public WebDriver driver;
	public LoginPage page;
	//public static Logger logger =LogManager.getLogger(LogInPageTestRunner.class);
	
	@BeforeMethod 
	public void setUp(){
		driver=CreateDriver.getDriver();
		page=new LoginPage(driver);
		//logger.info("Launch Browser");
	}
	
	@Test(enabled=false)
	public void AM_01(){
		page.mouseHover();
		//logger.info("Mouse hover loginpage");
		page.clickOnSignIn();
		String userName=GetData.fromExcel("AmazonTestCase.xlsx", "Sheet1", 12, 4);
		System.out.println("UserName--> " +  userName);
		page.enteruserName(userName);
		page.clickOnContinueBtn();
		String password=GetData.fromExcel("AmazonTestCase.xlsx", "Sheet1", 14, 4);
		page.enterPassword(password);
		page.clickOnContinueBtn();
		
}
	
	@Test(enabled=false)
	public void AM_02(){
		page.mouseHover();
		page.clickOnSignIn();
		String userName=GetData.fromExcel("AmazonTestCase.xlsx", "Sheet1", 19, 4);
		System.out.println("UserName--> " +  userName);
		page.enteruserName(userName);
		page.clickOnContinueBtn();
		String actualStr=page.invaliduserNameErrorMess();
		String expectedStr=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 8, 0);
		System.out.println("expectedStr--> " +  expectedStr);
		Assert.assertEquals( actualStr, expectedStr);
	}

    @Test()
    public void AM_03(){
    	page.mouseHover();
    	page.clickOnSignIn();
    	String userName=GetData.fromExcel("AmazonTestCase.xlsx", "Amazon", 22, 4);
		System.out.println("UserName--> " +  userName);
		String userPassword=GetData.fromExcel("AmazonTestCase.xlsx", "Amazon", 24, 4);
		System.out.println("userPassword--> " + userPassword);
		page.enteruserName(userName);
		page.clickOnContinueBtn();
		page.enterPassword(userPassword);
		page.clickOnSignBtn();
		String actualpsserror=page.invalidpassworderror();
		System.out.println(actualpsserror);
		String expPaswordError=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 12, 0);
		System.out.println("userPassword--> " + userPassword);
		Assert.assertEquals(actualpsserror, expPaswordError);  	   	
    }
	@AfterMethod
	public void tearDown(){
		driver.close();
		//logger.info("LogOut browser");
	}


}
