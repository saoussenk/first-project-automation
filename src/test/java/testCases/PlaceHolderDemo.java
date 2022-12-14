package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceHolderDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement PlaceHolder = driver.findElement(By.id("toolTipTextField"));
		
		String textPlaceHolder = PlaceHolder.getAttribute("placeholder");
		
		System.out.println("The PlaceHolder of the field is: "+ textPlaceHolder);

	}
    
}
