package com.myselenium.iebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\IE Browser\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source=driver.findElement(By.xpath("//div[@id='resizable']"));
		act.dragAndDropBy(source, 50, 80).perform();


	}

}
