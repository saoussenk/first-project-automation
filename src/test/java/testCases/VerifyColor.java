package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyColor {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://fr-fr.facebook.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		//verify color
		String color = driver.findElement(By.linkText("Mot de passe oublié ?")).getCssValue("color");

	}

}
