package draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "src/test/resource/drivers/geckodriver.exe");

		// open firefox
		WebDriver driver = new FirefoxDriver();

		// open application my store
		driver.get("https://www.zara.com/fr/fr/logon");

		// maximize browser
		driver.manage().window().maximize();

		// delete all the cookies
		driver.manage().deleteAllCookies();

		// fill username
		driver.findElement(By.name("logonId")).sendKeys("Kouki.saoussen94@gmail.com");
		
		//fill user_password
		driver.findElement(By.name("password")).sendKeys("Sap1234Dev*-");
		
		//click signin in button
		driver.findElement(By.xpath("//button[@class='zds-button closed-for-sale-logon-view__form-button']")).click(); 
		
		driver.quit();
		

	}

}
