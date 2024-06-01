package com.ShoppersStack_Sanju_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_Sanju.GenericUtility.BaseTest;
import com.ShoppersStack_Sanju.Pom.AddressFrom_Page;
import com.ShoppersStack_Sanju.Pom.MyAddress_Page;
import com.ShoppersStack_Sanju.Pom.MyProfile_Page;


public class Verify_User_Is_Able_to_Add_Address_or_Not_Test extends BaseTest {

@Test


  public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
	homePage.getAccountSettingBtn().click();
	Thread.sleep(2000);
	homePage.getMyProfileBtn().click();
	
	MyProfile_Page myprofile=new MyProfile_Page(driver);
	myprofile.getMyAddressBtn().click();
	
	MyAddress_Page myaddress=new MyAddress_Page(driver);
	myaddress.getMyAddressBtn().click();
	
	AddressFrom_Page addressfrom = new AddressFrom_Page(driver);
	addressfrom.getOfficeRBtn().click();
	addressfrom.getNameBtn().sendKeys(file.readExcelData("Sheet1", 1, 0));
	addressfrom.getHouseBtn().sendKeys(file.readExcelData("Sheet1", 1, 1));
	addressfrom.getStreetInfoBtn().sendKeys(file.readExcelData("Sheet1", 1, 2));
	addressfrom.getLandmarkBtn().sendKeys(file.readExcelData("Sheet1", 1, 3));
	
	webdriver.selectByValue(addressfrom.getCountryBtn(), file.readPropertyData("country"));
	webdriver.selectByValue(addressfrom.getStateBtn(), file.readPropertyData("state"));
	webdriver.selectByValue(addressfrom.getCityBtn(), file.readPropertyData("city"));
	
	addressfrom.getPincodeBtn().sendKeys(file.readExcelData("Sheet1", 1, 4));
	addressfrom.getPhoneNumberBtn().sendKeys(file.readExcelData("Sheet1", 1, 5));
    addressfrom.getAddAddressBtn().click();
    Thread.sleep(3000);

	}

}
