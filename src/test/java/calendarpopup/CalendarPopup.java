package calendarpopup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPopup {

	public static void main(String[] args) throws Exception {
//		Create a java representation of the excel sheet
		FileInputStream fis = new FileInputStream("./data/testScriptData.xlsx");
//		Create the workbook
		Workbook wb = WorkbookFactory.create(fis);
//		Get the control of the sheet
		Sheet sheet = wb.getSheet("Sheet2");
//		Get the control of the row
		Row row = sheet.getRow(1);
//		Get the control of the cell and get the value and store it in the variable
		String monthYear = row.getCell(1).getStringCellValue();
		String day = row.getCell(0).getStringCellValue();
//		close the workbook
		wb.close();

//		Create the driver reference
		WebDriver driver = new ChromeDriver();
//		maximize the browser window
		driver.manage().window().maximize();
//		Time delay for findElement and findElements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Explicit wait for remaining search criteria
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
//		Navigate to the main url
		driver.get("https://www.makemytrip.com/");
		
//		Creating the reference variable of Actions class to avoid login popup by clicking at 0,0 offSet.
		Actions actions = new Actions(driver);
		actions.click().perform();
//		To click on departure calendar hidden div popup
		driver.findElement(By.xpath("//label[@for='departure']")).click();
//		To click on desired date use infinite for loop
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthYear+"']/ancestor::div[@class='DayPicker-Month']//p[text()='"+day+"']"));
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.quit();
	}

}
