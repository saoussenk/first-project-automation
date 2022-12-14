package draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement placeholder = driver.findElement(By.id("toolTipTextField"));
		String textplaceholder = placeholder.getAttribute("placeholder");
		System.out.println("The placeholder of the failed is "+textplaceholder);
		
		
	}

}
