package pac1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrgUsingExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testData.properties");
		Properties propObj = new Properties();
		propObj.load(fis);
		
		String broswer = propObj.getProperty("browser");
		String url = propObj.getProperty("url");
		String username = propObj.getProperty("username");
		String password = propObj.getProperty("password");
		
		WebDriver driver = null;
		if (broswer.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (broswer.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (broswer.equals("edge")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Organizations")));
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		FileInputStream fisExcel = new FileInputStream("./data/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		driver.findElement(By.name("accountname")).sendKeys(value);
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		try {
			String createdName = driver.findElement(By.id("dtlview_Organization Name")).getText();
			if (createdName.equals(value)) {
				System.out.println("Given organization name is created");
			} 
		}catch(NoSuchElementException e) {
			driver.switchTo().alert().accept();
			System.out.println("Given organization name is not created or already exists");
		}
		
		Cell writeToCell = row.createCell(4);
		writeToCell.setCellValue("PASS");
		
		FileOutputStream fos = new FileOutputStream("./data/testScriptData.xlsx");
		wb.write(fos);
		wb.close();
		
		WebElement signOutMenu = driver.findElement(By.xpath("//img[contains(@src,'images/user')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signOutMenu);
		actions.perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}

}
