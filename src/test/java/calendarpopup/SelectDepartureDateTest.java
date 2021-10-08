package calendarpopup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectDepartureDateTest {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusDays(2);
		int day = ldt.getDayOfMonth();
		String month = ldt.getMonth().name();
		month = month.substring(0,1)+month.substring(1).toLowerCase();
		int year = ldt.getYear();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		actions.click().perform();
		//div[@class='fsw_inputBox dates inactiveWidget ']
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
	}
}
