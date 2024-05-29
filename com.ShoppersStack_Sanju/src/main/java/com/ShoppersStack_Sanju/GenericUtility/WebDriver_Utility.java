package com.ShoppersStack_Sanju.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	Java_Utility js=new Java_Utility();
	
	Select sel;
	Actions act;
	public void selectByValue(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int num)
	{
		sel=new Select(element);
		sel.selectByIndex(num);
	}
	
	public void selectByVisibleText(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public void deselectByValue(WebElement element, String value)
	{
		sel=new Select(element);
		sel.deselectByValue(value);
	}
	
	public void deselectByindex(WebElement element, int num)
	{
		sel=new Select(element);
		sel.deselectByIndex(num);
	}
	
	public void deselectByvisibleText(WebElement element, String value)
	{
		sel=new Select(element);
		sel.deselectByVisibleText(value);
	}
	
	public void deselctall(WebElement element)
	{
		sel=new Select(element);
		sel.deselectAll();
	}
	public void actionmoveToElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element);
	}

public void getwebpagescreenshot(WebDriver driver, WebElement element) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(FrameWorkConstants.screenshotpath+js.locaDateTime()+".png");
	FileHandler.copy(temp, dest);
}

public void getwebelementscreenshot(WebElement element) throws IOException
{
	File temp=element.getScreenshotAs(OutputType.FILE);
	File dest=new File(FrameWorkConstants.screenshotpath+js.locaDateTime()+".png");
	FileHandler.copy(temp,dest);
}

}

