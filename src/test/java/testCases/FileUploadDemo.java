package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

		
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

			// open chrome
			WebDriver driver = new ChromeDriver();

			// open application my store
			driver.get("https://demo.guru99.com/test/upload/");

			// maximize browser
			driver.manage().window().maximize();
			WebElement btnUpload = driver.findElement(By.id("file_wraper0"));
			btnUpload.sendKeys("D://formation Selenium//test.txt");
			
			
			driver.close();
			driver.quit();
	

	}

}
