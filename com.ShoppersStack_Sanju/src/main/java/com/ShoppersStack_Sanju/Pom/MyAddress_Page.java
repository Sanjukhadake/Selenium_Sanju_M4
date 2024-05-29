package com.ShoppersStack_Sanju.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
public MyAddress_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='Add Address']")
private WebElement MyAddressBtn;

@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement RemoveAddressBtn;

@FindBy(xpath="(//button[@type='button'])[3]")
private WebElement UpdateAddressBtn;

@FindBy(xpath="//button[text()='Yes']")
private WebElement Yes1Btn;

public WebElement getYesBtn() {
	return Yes1Btn;
}

public WebElement getUpdateAddressBtn() {
	return UpdateAddressBtn;
}

public WebElement getRemoveAddressBtn() {
	return RemoveAddressBtn;
}

public WebElement getMyAddressBtn() {
	return MyAddressBtn;
}

}
