package com.ShoppersStack_Sanju_Test;

import org.testng.annotations.Test;

import com.ShoppersStack_Sanju.GenericUtility.BaseTest;
import com.ShoppersStack_Sanju.Pom.MyAddress_Page;
import com.ShoppersStack_Sanju.Pom.MyProfile_Page;

public class Verifyuser_is_able_to_remove_address_or_not_Test extends BaseTest {

@Test
public void removeAddress() throws InterruptedException {
	homePage.getAccountSettingBtn().click();
	Thread.sleep(2000);
	homePage.getMyProfileBtn().click();
	
	MyProfile_Page myprofile=new MyProfile_Page(driver);
	myprofile.getMyAddressBtn().click();
	Thread.sleep(2000);
	MyAddress_Page myaddress=new MyAddress_Page(driver);
	myaddress.getRemoveAddressBtn().click();
	Thread.sleep(2000);
	myaddress.getYesBtn().click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
	
}
	
}
