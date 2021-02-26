package objects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Home {

	public static final String URL = "https://www.humanity.com/";
	public static final String ABOUT_US_URL = "https://www.humanity.com/about";

	private static final String NAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String EMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String STARTFT_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String COMPANY_NAME_XPATH = "/html/body/div/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String INDUSTRY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/span";
	private static final String PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String CONFIRM_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String START_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";

	private static final String SECOND_SIGNIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String SECOND_NAME_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String SECOND_EMAIL_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String SECOND_STARTFT_XPATH = "//*[@id=\"popup-free-trial-link\"]";

	private static final String HOVERING_ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	private static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";

	private static final String CLOSE_ANNOUNCEMENT_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String DENYCOOKIES_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button/span";

	private static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	private static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	private static final String LOGIN_PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String LOGIN_BTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	public static void newUser(WebDriver driver) {
		driver.findElement(By.xpath(CLOSE_ANNOUNCEMENT_XPATH)).click();
		driver.findElement(By.xpath(DENYCOOKIES_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(NAME_XPATH)).sendKeys("Denni. Rodman");
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys("crvvvvvv@email.com");
		driver.findElement(By.xpath(STARTFT_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(COMPANY_NAME_XPATH)).click();
		driver.findElement(By.xpath(COMPANY_NAME_XPATH)).sendKeys("Pistons Inc.");
		driver.findElement(By.xpath(INDUSTRY_XPATH)).click();
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(ROLE_XPATH)).click();
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(PHONE_XPATH)).click();
		driver.findElement(By.xpath(PHONE_XPATH)).sendKeys("777 777 777");
		driver.findElement(By.xpath(PASSWORD_XPATH)).click();
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("Denis.91");
		driver.findElement(By.xpath(CONFIRM_PASSWORD_XPATH)).click();
		driver.findElement(By.xpath(CONFIRM_PASSWORD_XPATH)).sendKeys("Denis.91");
		driver.findElement(By.xpath(START_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void secondPathNewUser(WebDriver driver) {
		driver.findElement(By.xpath(SECOND_SIGNIN_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SECOND_NAME_XPATH)).sendKeys("Ronaldo LuisN");
		driver.findElement(By.xpath(SECOND_EMAIL_XPATH)).sendKeys("roni9@email.com");
		driver.findElement(By.xpath(SECOND_STARTFT_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(COMPANY_NAME_XPATH)).click();
		driver.findElement(By.xpath(COMPANY_NAME_XPATH)).sendKeys("RoniNo.9");
		driver.findElement(By.xpath(INDUSTRY_XPATH)).click();
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(INDUSTRY_XPATH)).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(ROLE_XPATH)).click();
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(ROLE_XPATH)).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(PHONE_XPATH)).click();
		driver.findElement(By.xpath(PHONE_XPATH)).sendKeys("777 777 777");
		driver.findElement(By.xpath(PASSWORD_XPATH)).click();
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("Roni.9");
		driver.findElement(By.xpath(CONFIRM_PASSWORD_XPATH)).click();
		driver.findElement(By.xpath(CONFIRM_PASSWORD_XPATH)).sendKeys("Roni.9");
		driver.findElement(By.xpath(START_XPATH)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void aboutUs(WebDriver driver) {
		driver.findElement(By.xpath(HOVERING_ABOUTUS_XPATH)).click();
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}

	public static void logIn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_XPATH)).sendKeys("crvvvvvv@email.com");
		driver.findElement(By.xpath(LOGIN_PASSWORD_XPATH)).sendKeys("Denis.91");
		driver.findElement(By.xpath(LOGIN_BTN_XPATH)).click();
	}

}
