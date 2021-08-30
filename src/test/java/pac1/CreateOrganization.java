package pac1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganization {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/testData.properties");
		Properties propObj = new Properties();
		propObj.load(fis);
		
		String broswer = propObj.getProperty("browser");
		String url = propObj.getProperty("url");
		String username = propObj.getProperty("username");
		String password = propObj.getProperty("password");
		String orgName = propObj.getProperty("orgName");
		
		WebDriver driver = null;
		if (broswer.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (broswer.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (broswer.equals("edge")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Organizations")));
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		try {
			String createdName = driver.findElement(By.id("dtlview_Organization Name")).getText();
			if (createdName.equals(orgName)) {
				System.out.println("Given organization name is created");
			} 
		}catch(NoSuchElementException e) {
			driver.switchTo().alert().accept();
			System.out.println("Given organization name is not created or already exists");
		}
		WebElement signOutMenu = driver.findElement(By.xpath("//img[contains(@src,'images/user')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signOutMenu);
		actions.perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}
	
}
