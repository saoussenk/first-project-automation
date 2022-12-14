package testCases;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("https://demoqa.com/buttons");

		// maximize browser
		driver.manage().window().maximize();
		
		//Instantiate Actions Class
		Actions actions = new Actions(driver);
		
		//Retrieve web Element to perform double click 
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		//Double Click on the button
		actions.doubleClick(btnDoubleClick).build().perform();
		
		String actualMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		String expectedMessage = "You have done a double click";
		Assert.assertEquals(expectedMessage, actualMessage);
		
		
		driver.quit();
		


	}

}
