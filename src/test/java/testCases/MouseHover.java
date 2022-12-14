package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
	
		
		// open chrome
				WebDriver driver = new ChromeDriver();

				// open application my store
				driver.get("https://demoqa.com/menu/");

				// maximize browser
				driver.manage().window().maximize();
				
				Actions actions = new Actions(driver);
				WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
                actions.moveToElement(mouseHover).perform();
                
                
               // driver.quit() 
                
	}
}