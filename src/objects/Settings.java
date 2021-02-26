package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Settings {

	public static final String URL = "https://pistonsinc.humanity.com/app/admin/settings/";

	private static final String LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	private static final String SAVE_SETTINGS_XPATH = "//*[@id=\"act_primary\"]";
	private static final String REFRESH_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[1]/label/a";

	private static final String NOTIFICATION_EMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
	private static final String NOTIFICATION_SMS_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String NOTIFICATION_PUSH_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";

	public static void changeLanguage(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(LANGUAGE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Select lang = new Select(driver.findElement(By.name("language")));
		lang.selectByVisibleText("Croatian (machine)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(REFRESH_XPATH)).click();
	}

	public static void disableNotifications(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(NOTIFICATION_EMAIL_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(NOTIFICATION_SMS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(NOTIFICATION_PUSH_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
	}

}
