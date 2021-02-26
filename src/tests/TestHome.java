package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.MyFirm;

public class TestHome {

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void testNewUser() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();

		Home.newUser(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";

		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void testSecondPathNewUser() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();

		Home.secondPathNewUser(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void testAboutUs() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();

		Home.aboutUs(driver);
		TakesScreenshot scr = ((TakesScreenshot) driver);
		File file = scr.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./scrnshot/aboutUs.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String actual = driver.getCurrentUrl();
		String expected = Home.ABOUT_US_URL;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void logIn() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();

		Home.logIn(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/app/";
		Assert.assertEquals(actual, expected);
	}
	
	@AfterClass
	public void closePage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
