package com.testrunnerPageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazonbusiesslib.CreateDriver;
import com.amazonbusiesslib.GetData;

import com.amazopompagefactory.LoginPageInvalid;
import com.amazopompagefactory.LoginpagePF;
import com.amazopompagefactory.Loginpage_InvalidUser;

public class LoginTestpageF {
	public WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		driver=CreateDriver.getDriver();
	}
	
	@Test(enabled = false)
	public void TC_01(){
		LoginpagePF page=PageFactory.initElements(driver, LoginpagePF.class);
		String userName=GetData.fromExcel("AmazonTestCase.xlsx", "Amazon", 12, 4);
		System.out.println("UserName--> " +  userName);
		String userPassword=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 9, 0);
		System.out.println("userPassword--> " +  userPassword);
		page.LogInpage(userName);	
	}
	@Test(enabled = false)
	public void TC_02() {
	LoginPageInvalid page=PageFactory.initElements(driver, LoginPageInvalid.class);
	page.mouseHoverSign();
	page.clickOnSignBtn();
	
	String userName=GetData.fromExcel("AmazonTestCase.xlsx", "Amazon", 12, 4);
	System.out.println("UserName--> " +  userName);
	String userPassword=GetData.fromExcel("AmazonTestCase.xlsx", "Amazon", 14, 4);
	System.out.println("userPassword--> " +  userPassword);
	
	
	page.loginApp(userName, userPassword);
	
	String actualError=page.getErrMsgForInvalidPass();
	
	String expError=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 13, 0);
	Assert.assertEquals(actualError, expError);
	}
	
	@Test
	public void TC_03() {
		
		Loginpage_InvalidUser page=PageFactory.initElements(driver,Loginpage_InvalidUser.class);
		String invalidusername=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 0, 0);
		System.out.println("invalidusername--> " +  invalidusername);
		page.enterInvalidUserName(invalidusername);
		String errMsgActual=page.getinvalidUserErrMsg();
		String errMsgExpected=GetData.fromExcel("AmazonTestCase.xlsx", "Data", 0, 1);
		System.out.println("errMsgExpected--> " +  errMsgExpected);
		Assert.assertEquals(errMsgActual, errMsgExpected);
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
