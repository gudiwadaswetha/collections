package calendarpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPriceOfMobileFlipkartTest {

	public static void main(String[] args) {
//		Create the driver reference
		WebDriver driver = new ChromeDriver();
//		maximize the browser window
		driver.manage().window().maximize();
//		Time delay for findElement and findElements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Explicit wait for remaining search criteria
		WebDriverWait wait = new WebDriverWait(driver, 10);		
	}

}
