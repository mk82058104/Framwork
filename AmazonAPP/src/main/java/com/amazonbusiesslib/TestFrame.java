package com.amazonbusiesslib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\driver22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int noOfFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("NoOfFrame..." +noOfFrame );
		driver.switchTo().frame("Frame1");
		String actualStr=driver.findElement(By.xpath("//p[contains(text(),'I am inside Frame')]")).getText();
		String expStr="I am inside Frame";
		Assert.assertEquals(actualStr, expStr);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Pavilion')]")).click();
		String actualStrTitle=driver.getTitle();
		System.out.println(actualStrTitle);
		String expectedStrTitle="iframes";
		Assert.assertEquals(actualStrTitle, expectedStrTitle);
		//driver.quit();
		

	}

}
