package testCases;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("https://demoqa.com/buttons");

		// maximize browser
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		// Retrieve web Element to perform double click
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		
		actions.contextClick(btnRightClick).perform();
		
		String actualMessage = driver.findElement(By.id("rightClickMessage")).getText();
		String expectedMessage = "You have done a right click";
		Assert.assertEquals(expectedMessage, actualMessage);
		
		//driver.quit();
		

	}

}
