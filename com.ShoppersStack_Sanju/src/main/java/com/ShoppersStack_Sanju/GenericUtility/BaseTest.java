package com.ShoppersStack_Sanju.GenericUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_Sanju.Pom.Home_Page;
import com.ShoppersStack_Sanju.Pom.Login_Page;
import com.ShoppersStack_Sanju.Pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	
public	WebDriver driver;
public	static WebDriver listenersDriver;
public	Welcome_Page welcomePage;
public	Login_Page loginPage;
public	Home_Page homePage;
public	File_Utility file =new File_Utility();
public WebDriver_Utility webdriver = new WebDriver_Utility();
public Java_Utility js=new Java_Utility();
public ExtentSparkReporter spark;
public ExtentReports report;
public ExtentTest test;
	
	
@BeforeSuite
public void beforesuite()
	{
	System.out.println("beforesuite");	
	}

@BeforeTest
public void beforetest()
	{
	System.out.println("beforetest");
	spark=new ExtentSparkReporter("./reports/"+js.locaDateTime()+".html");
	report=new ExtentReports();
	report.attachReporter(spark);
	test=report.createTest("Demo");
	
	}

@BeforeClass
 public void beforeclass() throws IOException
{
	System.out.println("beforeclass");
	
	String browser=file.readPropertyData("browser");
	String url=file.readPropertyData("url");
//	
//	String browser = System.getProperty("browser");
//	String url = System.getProperty("url");
	
	if (browser.contains("chrome")) {
		driver= new ChromeDriver();
	}
	else if (browser.contains("firefox")) {
		driver=new FirefoxDriver();
		
	}
	else if (browser.contains("edge")) {
		driver=new EdgeDriver();
	}
	else
	{
	System.out.println("Enter Valid Browser Name");	
	}
	
	listenersDriver=driver;
	welcomePage = new Welcome_Page(driver);
	loginPage = new Login_Page(driver);
	homePage = new Home_Page(driver);
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	driver.get(url);
}

@BeforeMethod
public void beforemethod() throws IOException, InterruptedException
{  
	
	System.out.println("beforemethod");	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	welcomePage.getLoginbutton().click();
	loginPage.getEmailBtn().sendKeys(file.readPropertyData("username"));
	loginPage.getPasswordBtn().sendKeys(file.readPropertyData("password"));
	loginPage.getLoginbttn().click();
	Thread.sleep(2000);
}

@AfterMethod
public void aftermethod() throws InterruptedException
{
	
	System.out.println("aftermethod");	
	Thread.sleep(3000);
	homePage.getAccountSettingBtn().click();
	Thread.sleep(3000);
	homePage.getLogoutBtn().click();

}

@AfterClass
public void afterclass()
{
  System.out.println("afterclass");	
 driver.quit();
}

@AfterTest
public void aftertest()
{
   System.out.println("aftertest");	
   report.flush();
}

@AfterSuite
public void aftersuite()
{
   System.out.println("aftersuite");	
}



}
