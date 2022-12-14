package draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		
		Actions actions = new Actions(driver); 
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		actions.moveToElement(slider, 45, 0).perform();
		slider.click();
		
		
		
		
		

	}

}
