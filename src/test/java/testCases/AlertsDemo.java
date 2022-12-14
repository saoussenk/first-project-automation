package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("https://demoqa.com/alerts");

		// maximize browser
		driver.manage().window().maximize();
		
		WebElement btnClickMe =  driver.findElement(By.id("alertButton"));
		btnClickMe.click();
		
		// accept alert 
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle(); 
		System.out.println("the title of application is: "+ title);
		
		driver.quit();
		
	}

}
