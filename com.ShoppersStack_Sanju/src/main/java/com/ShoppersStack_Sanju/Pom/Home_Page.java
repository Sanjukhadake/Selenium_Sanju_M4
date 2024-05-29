package com.ShoppersStack_Sanju.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
public Home_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[local-name()='svg' and @data-testid='SettingsIcon']")////div[text()='s']
private WebElement AccountSettingBtn;

@FindBy(xpath="//li[text()='My Profile']")
private WebElement MyProfileBtn;

@FindBy(xpath="//li[text()='Logout']")
private WebElement logoutBtn;

public WebElement getAccountSettingBtn() {
	return AccountSettingBtn;
}

public WebElement getMyProfileBtn() {
	return MyProfileBtn;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}


	
}
