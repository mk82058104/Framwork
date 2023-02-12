package com.guru99magntotestrunner;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazonbusiesslib.CreateDriver;
import com.guru99magnto.MobileListPage;

public class TestRunnerMagntoGuru99 {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver=CreateDriver.getDriver();
	}

	@Test
	public void verifySortedMobileByName_Tc_01() {
		MobileListPage page	=PageFactory.initElements(driver,MobileListPage.class);
		String getTitle=page.getTitleOfpage();
		System.out.println(getTitle);
		String expectedTitle="Home page";
		Assert.assertEquals(getTitle, expectedTitle);
		page.clickOnMobileMenue();
		String getTitleAfteClickOnMbile=page.getTitleOfpage();
		System.out.println(getTitleAfteClickOnMbile);
		String expectedgetTitleAfteClickOnMbile="Mobile";
		Assert.assertEquals(getTitle, expectedTitle);
		page.sortByName("Name");
		List<WebElement>  actuallistOfMobile	=driver.findElements(By.cssSelector("h2 a"));
		for(int i=0;i<actuallistOfMobile.size();i++) {
			String 	actuallistOfMobileStr=actuallistOfMobile.get(i).getText();
			System.out.println("actuallistOfMobileStr--> " + actuallistOfMobileStr);
			List<String> lstMovedItem=new ArrayList<String>();
			String newListMobile= actuallistOfMobile.get(i).getText();
			System.out.println("newListMobile--> " + newListMobile);
			lstMovedItem.add(actuallistOfMobile.get(i).getText());
			Assert.assertEquals(actuallistOfMobileStr, newListMobile);
		}

	}
	
	@Test
	public void verifyXperiyaPrice_02() {
		MobileListPage page	=PageFactory.initElements(driver,MobileListPage.class);
		page.clickOnMobileMenue();
		page.clickOnsonyXperia();
	String getSonyexppriceAtual	=page.getsonyXperiprice();
	String getSonyexppriceExp="$100.00";
	Assert.assertEquals(getSonyexppriceAtual, getSonyexppriceExp);
	String actualSoneyPrice=page.getsonyXperiaText();
	String expectedSoneyTxt="SONY XPERIA";
	System.out.println(actualSoneyPrice);
	Assert.assertEquals(actualSoneyPrice, expectedSoneyTxt);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
