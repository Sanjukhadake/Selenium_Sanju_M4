package com.ShoppersStack_Sanju_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.ShoppersStack_Sanju.GenericUtility.BaseTest;
import com.ShoppersStack_Sanju.Pom.MyAddress_Page;
import com.ShoppersStack_Sanju.Pom.MyProfile_Page;
import com.ShoppersStack_Sanju.Pom.Update_address;

public class Verify_useris__able_to_update_Address_or_not_Test extends BaseTest {
@Test
public void udateaddres() throws InterruptedException, AWTException {
	homePage.getAccountSettingBtn().click();
	Thread.sleep(2000);
	homePage.getMyProfileBtn().click();
	
	MyProfile_Page myprofile=new MyProfile_Page(driver);
	myprofile.getMyAddressBtn().click();
	
	MyAddress_Page myaddress=new MyAddress_Page(driver);
	myaddress.getUpdateAddressBtn().click();
	Thread.sleep(3000);
//	myaddress.getUpdateAddressBtn().click();
	
	Update_address update=new Update_address(driver);
	Thread.sleep(3000);
	update.getUpdateNamebtn().click();
	Thread.sleep(2000);
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_DELETE);
	update.getUpdateNamebtn().sendKeys("KHADAKE");
	Thread.sleep(3000);
	update.getUpdateHousebtn().click();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_DELETE);
	Thread.sleep(2000);
	update.getUpdateHousebtn().sendKeys("KHADAKE HOUSE");
	Thread.sleep(3000);
	
	update.getUpdateaddress1btn().click();
	Thread.sleep(3000);
}
}
