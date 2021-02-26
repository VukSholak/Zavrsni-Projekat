package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Settings;

public class TestSettings {

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void loggingIn() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Home.logIn(driver);
	}

	@Test(priority = 0)
	public void changeLanguage() {
		driver.navigate().to(Settings.URL);
		Settings.changeLanguage(driver);
		
		driver.findElement(By.linkText("Sukobi")).click();
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/admin/conflicts/";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void notification() {
		driver.navigate().to(Settings.URL);
		Settings.disableNotifications(driver);
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
