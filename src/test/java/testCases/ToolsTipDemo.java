package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsTipDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/tool-tips/");

		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();

		// verify
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass: tooltip matching expected value");
		} else {
			System.out.println("Fail:tooltip not matching expected value");

		}

		// to do add assert

		driver.quit();

	}

}
