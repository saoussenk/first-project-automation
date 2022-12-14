package testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public WebDriver driver;
	
@BeforeClass
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
	}
	
    @Test
	public void valid_UserCredential() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button [@type='submit']")).click();
    }
    
    @Test
	public void invalid_UserCredential() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Saoussen");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Saoussen123");
		driver.findElement(By.xpath("//button [@type='submit']")).click();
	}
    
    @AfterClass
	public void tearDown() {
		driver.quit();
	}

}

