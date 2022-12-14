package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		// find web element
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement parmentAdress = driver.findElement(By.id("permanentAddress"));

		// instantiate Actions class
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "Saoussen").perform();
		actions.sendKeys(userEmail, "Saoussenhouas@gmail.com").perform();
		actions.sendKeys(currentAdress, "155 Rue Saint Charles Paris 75015").perform();

		// copy current adress to permanent adress
		actions.keyDown(currentAdress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(parmentAdress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		// javascript executor click button submit
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSubmit);

		driver.quit();

	}

}
