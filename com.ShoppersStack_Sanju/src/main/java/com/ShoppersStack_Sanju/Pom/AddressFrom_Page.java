package com.ShoppersStack_Sanju.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFrom_Page {
public AddressFrom_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="Office")
private WebElement OfficeRBtn;

@FindBy(id="Name")
private WebElement NameBtn;

@FindBy(id="House/Office Info")
private WebElement HouseBtn;

@FindBy(id="Street Info")
private WebElement StreetInfoBtn;

@FindBy(id="Landmark")
private WebElement LandmarkBtn;

@FindBy(id="Country")
private WebElement CountryBtn;

@FindBy(id="State")
private WebElement StateBtn;

@FindBy(id="City")
private WebElement CityBtn;

@FindBy(id="Pincode")
private WebElement PincodeBtn;

@FindBy(id="Phone Number")
private WebElement PhoneNumberBtn;

@FindBy(id="addAddress")
private WebElement addAddressBtn;

public WebElement getOfficeRBtn() {
	return OfficeRBtn;
}

public WebElement getNameBtn() {
	return NameBtn;
}

public WebElement getHouseBtn() {
	return HouseBtn;
}

public WebElement getStreetInfoBtn() {
	return StreetInfoBtn;
}

public WebElement getLandmarkBtn() {
	return LandmarkBtn;
}

public WebElement getCountryBtn() {
	return CountryBtn;
}

public WebElement getStateBtn() {
	return StateBtn;
}

public WebElement getCityBtn() {
	return CityBtn;
}

public WebElement getPincodeBtn() {
	return PincodeBtn;
}

public WebElement getPhoneNumberBtn() {
	return PhoneNumberBtn;
}

public WebElement getAddAddressBtn() {
	return addAddressBtn;
}


}
