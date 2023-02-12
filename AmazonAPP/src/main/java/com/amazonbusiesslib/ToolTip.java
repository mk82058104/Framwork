package com.amazonbusiesslib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\driver22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//*[@id='topnav']/div/div[1]/a[12]"));
		 String actualStr=ele.getAttribute("title");
		 System.out.println(actualStr);
		 String expStr="Java Tutorial";
		 Assert.assertEquals(actualStr, actualStr);

	}

}
