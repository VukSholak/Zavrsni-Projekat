package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyFirm {

	public static final String URL = "https://pistonsinc.humanity.com/app/dashboard/";

	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	private static final String SHIFTPLANNING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	private static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	private static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	private static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	private static final String PAYROLL_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a";
	private static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";

	private static final String ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
	private static final String ADD_FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	private static final String ADD_LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	private static final String ADD_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	private static final String SAVE_NEW_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";

	private static final String ADDED_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	private static final String ADDED_EMPLOYEE_EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String ADDED_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVE_CHANGES_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";

	public static void dashboardClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void shiftplanningClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SHIFTPLANNING_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void timeclockClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(TIMECLOCK_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void leaveClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void trainingClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void staffClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void availabilityClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(AVAILABILITY_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void payrollClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void reportsClick(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void addEmployee(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_FIRSTNAME_XPATH)).sendKeys("Ron");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_LASTNAME_XPATH)).sendKeys("Harper");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_EMAIL_XPATH)).sendKeys("ronihar@email.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_XPATH)).click();
	}

	public static void changeName(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Ron Harper")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_EDIT_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).sendKeys("Ronnie");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Save Employee")).click();
		driver.findElement(By.linkText("Ronnie Harper")).click();

	}
	
	public static void fiveEmployeesInput(WebDriver driver) {
		
		File f = new File("Employees.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);
			Row row;
			for (int i = 0; i < 6; i++) {
				row = sheet.getRow(i);
				String name = row.getCell(0).toString();
				String surname = row.getCell(1).toString();
				String email = row.getCell(2).toString();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH)).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_FIRSTNAME_XPATH)).sendKeys(name);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_LASTNAME_XPATH)).sendKeys(surname);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_EMAIL_XPATH)).sendKeys(email);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_XPATH)).click();

				wb.close();
				driver.findElement(By.xpath(STAFF_XPATH)).click();
			}
		} catch (IOException e) {
			System.out.println("Nije pronadjen fajl!");
			e.printStackTrace();
		}
	}
	
	public static void checkAddedEmployee(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Ronnie Harper")).click();
	}
	public static void checkAddedEmployee1(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Alonzo Morning")).click();
	}
	public static void checkAddedEmployee2(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Derek Rouz")).click();
	}
	public static void checkAddedEmployee3(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Dzo Dumars")).click();
	}
	public static void checkAddedEmployee4(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Majkl Dzordan")).click();
	}
	public static void checkAddedEmployee5(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Patrik Juing")).click();
	}
	public static void addPicture(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Denni. Rodman")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Edit details")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Upload picture")).sendKeys("C:\\Users\\Vuk Solak\\ITBootcamp.eclipse-workspace\\zavrsniProjekat\\drodman.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Save Employee")).click();
		
	}
	
	

}
