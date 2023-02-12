package com.guru99magnto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MobileListPage {

	public WebDriver driver;

	public MobileListPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(xpath = "//a[contains(text(),'Mobile')]")
	WebElement mobileMenueLink;

	@FindBy(xpath = "(//a[contains(text(),'Set Descending Direction')])/preceding::select[1]")
	WebElement sortBy;

	@FindBy(xpath = "(//a[contains(text(),'Sony Xperia')])[1]")
	WebElement sonyXperia;

	@FindBy(xpath = "//span[contains(text(),'Sony Xperia')]")
	WebElement sonyXperiatxt;

	@FindBy(xpath = "//span[@id='product-price-1']/span")
	WebElement sonyXperiprice;




	public void clickOnMobileMenue() {
		mobileMenueLink.click();

	}

	public String getTitleOfpage() {
		String getTitle=	driver.getTitle();
		System.out.println("getTitle::" + getTitle);
		return getTitle;
	}

	public void sortByName(String name) {
		Select sel=new Select(sortBy);
		sel.selectByVisibleText(name);
	}

	public void clickOnsonyXperia() {
		sonyXperia.click();
	}

	public String getsonyXperiaText() {
		String actual=sonyXperiatxt.getText();
		return actual;
	}

	public String getsonyXperiprice() {
		String actualxperiprice	=sonyXperiprice.getText();
		return actualxperiprice;
	}

}
