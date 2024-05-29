package com.ShoppersStack_Sanju.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_address {
	public Update_address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement updateNamebtn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement updateHousebtn;
	
	public WebElement getUpdateaddress1btn() {
		return updateaddress1btn;
	}
	@FindBy(id="Update Address")
	private WebElement updateaddress1btn;

	public WebElement getUpdateNamebtn() {
		return updateNamebtn;
	}

	public WebElement getUpdateHousebtn() {
		return updateHousebtn;
	}
	

}
