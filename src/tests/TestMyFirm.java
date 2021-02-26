package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Home;
import objects.MyFirm;

public class TestMyFirm {

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
	public void dashboardOption() {

		MyFirm.dashboardClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void shiftPlanningOption() {

		MyFirm.shiftplanningClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/schedule/employee/week/overview/overview/23%2c1%2c2021/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void timeClockOption() {

		MyFirm.timeclockClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/timeclock/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void leaveOption() {

		MyFirm.leaveClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/requests/vacation/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void trainingOption() {

		MyFirm.trainingClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/training/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void stuffOption() {

		MyFirm.trainingClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/list/load/true/";
	}

	@Test(priority = 6)
	public void availabilityOption() {

		MyFirm.availabilityClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 7)
	public void payrollOption() {

		MyFirm.payrollClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/payroll/scheduled-hours/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 8)
	public void reportsOption() {

		MyFirm.reportsClick(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/reports/dashboard/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 9)
	public void addEmployees() {
		driver.navigate().to("https://pistonsinc.humanity.com/app/staff/list/load/true/");

		MyFirm.addEmployee(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (true) {
			TakesScreenshot scr = ((TakesScreenshot) driver);
			File file = scr.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("./scrnshot/employee.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Test(priority = 10)
	public void checkNewEmployee() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086684/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 11)
	public void changeName() {
		driver.navigate().to("https://pistonsinc.humanity.com/app/staff/list/load/true/");

		MyFirm.changeName(driver);

	}
	
	@Test(priority = 12)
	public void addNewEmployees() {
		driver.navigate().to("https://pistonsinc.humanity.com/app/staff/list/load/true/");
		
		MyFirm.fiveEmployeesInput(driver);
		
	}
	
	@Test(priority = 13)
	public void checkNewEmployees1() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee1(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086718/";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 14)
	public void checkNewEmployees2() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee2(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086719/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 15)
	public void checkNewEmployees3() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee3(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086687/";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 16)
	public void checkNewEmployees4() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee4(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086685/";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 17)
	public void checkNewEmployees5() {
		driver.navigate().to(MyFirm.URL);
		MyFirm.checkAddedEmployee5(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://pistonsinc.humanity.com/app/staff/detail/6086716/";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 18)
	public void addPicture() {
	driver.navigate().to("https://pistonsinc.humanity.com/app/staff/edit/6082079/");
	MyFirm.addPicture(driver);
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
