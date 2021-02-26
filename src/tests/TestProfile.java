package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Profile;

public class TestProfile {
	
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
	
	@Test (priority = 0)
	public void Nickname() {
		driver.navigate().to(Profile.URL);
		
		Profile.setNickname(driver);
		driver.navigate().refresh();
		
	}
	
	@Test (priority = 1)
	public void City() {
		driver.navigate().to(Profile.URL);
		
		Profile.setCity(driver);;
		driver.navigate().refresh();
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
