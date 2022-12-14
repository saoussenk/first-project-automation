package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("https://demoqa.com/select-menu");

		// maximize browser
		driver.manage().window().maximize();

		// create object of the select class
		WebElement dropeDownList = driver.findElement(By.id("oldSelectMenu"));
		Select se = new Select(dropeDownList);
		// se.selectByIndex(5);
		se.selectByValue("6");
		// se.deselectByVisibleText();

	}
}