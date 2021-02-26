package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	
	public static final String URL = "https://pistonsinc.humanity.com/app/staff/detail/6082079/";
	
	private static final String EDIT_PROFILE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
	private static final String CITY_XPATH = "//*[@id=\"city\"]";
	private static final String SAVE_EMPLOYEE_XPATH = "//*[@id=\"act_primary\"]";
	
	public static void setNickname(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(EDIT_PROFILE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(NICKNAME_XPATH)).sendKeys("The Worm");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH)).click();
	}
	
	public static void setCity (WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(EDIT_PROFILE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(CITY_XPATH)).sendKeys("Detroit");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH)).click();
	}

}
