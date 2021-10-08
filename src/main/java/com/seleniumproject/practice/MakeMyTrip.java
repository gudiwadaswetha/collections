package com.seleniumproject.practice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.makemytrip.com/");
		LocalDateTime ldt = LocalDateTime.now().plusDays(3);
		int year = ldt.getYear();
		String month = ldt.getMonth().name();
		int day = ldt.getDayOfMonth();
		month = month.substring(0, 1)+month.substring(1).toLowerCase();
		String monthYear = month + " "+year;

		new Actions(driver).click().perform();
		/*From */
		driver.findElement(By.id("fromCity")).click();
		String fromLoc = "Bangalore";
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromLoc);
		driver.findElement(By.xpath("//p[contains(text(),'"+fromLoc+"')]")).click();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		List<WebElement> list = driver.findElements(By.xpath("//li[@role='option']"));
//		for (WebElement ele : list) {
//			if (ele.getText().contains("Pune")) {
//				ele.click();
//				break;
//			}
//		}
		
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		String toLoc = "Hyderabad";
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toLoc);
		driver.findElement(By.xpath("//p[contains(text(),'"+toLoc+"')]")).click();
//		Thread.sleep(1000);
//		List<WebElement> listTo = driver.findElements(By.xpath("//li[@role='option']"));
//		for (WebElement toEle : listTo) {
//			if (toEle.getText().contains("Chennai")) {
//				toEle.click();
//				break;
//			}
//		}
	
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		String datePickerXpath = "//div[text()='"+monthYear+"']/ancestor::div[@class='DayPicker-Month']//p[text()='"+day+"']";
		for (;;) {
			try {
				driver.findElement(By.xpath(datePickerXpath)).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='listingCard']")));
		List<WebElement> listOfFlights = driver.findElements(By.xpath("//div[@class='makeFlex align-items-center  ']"));
//		List<WebElement> listOfFlights = driver.findElements(By.xpath("//div[@class='listingCard']"));
		System.out.println("Number of flights available are "+listOfFlights.size());
		for (WebElement ele : listOfFlights) {
			System.out.println(ele.getText());
		}
	}
}
