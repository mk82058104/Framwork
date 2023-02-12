package com.amazonbusiesslib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\driver22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int noOfFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("NoOfFrame..." +noOfFrame );
		driver.close();

	}

}
