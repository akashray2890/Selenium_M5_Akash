package com.ShoppersStack_genericutility;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
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

import com.ShoppersStack_pom.Welcome_page;
import com.ShoppersStack_pom.Working_Homepage;
import com.ShoppersStack_pom.Working_addadress;
import com.ShoppersStack_pom.Working_login_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Working_baseclass {
	public WebDriver driver;
	public static WebDriver listnerDriver;
	public Working_File_utility utility=new Working_File_utility();
	public Welcome_page welcomePage;
	public Working_login_page loginPage;
	public Working_Homepage homePage;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public Working_webdriver webUtility=new Working_webdriver();
	public Java_utility javaUtility=new Java_utility();
	public Working_addadress addaress;
	
	public WebDriverWait wait;

	public static WebDriver sDriver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test");
		spark=new ExtentSparkReporter(Frame_Constantrant.reportPath+javaUtility.localDateTime()+ ".html");
		report=new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("Demo");
	}
	@BeforeClass
	public void beforeClass() throws IOException  {
		
		System.out.println("@Before Class");
		
		String browser=utility.readProperty("browser");
		String url=utility.readProperty("url");
		
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Enter Valid Browser");
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		homePage =new Working_Homepage(driver);
	}
	@BeforeMethod
	public void beforeMethods() throws IOException, InterruptedException {
		System.out.println("@Before method");
		Welcome_page welcome=new Welcome_page(driver);
		WebElement ele = welcome.getLogin();
		
		WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		ele.click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",welcomePage.getLogin());
//		Thread.sleep(2000);
		Working_login_page loginPage=new Working_login_page(driver);
		loginPage.getEmiltxtfld().sendKeys(utility.readProperty("username"));
		Thread.sleep(1000);
		loginPage.getPaswtxtfld().sendKeys(utility.readProperty("password"));
		Thread.sleep(1000);
		loginPage.getSubbtn().click();
		
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("@After Method");
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",homePage.getSettbtn());
		//homePage.getSettbtn().click();
		homePage.getLogoutbtn().click();
		
		
		
		
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@After Class");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@After Test");
		report.flush();
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("@After Suite");
	}
}

