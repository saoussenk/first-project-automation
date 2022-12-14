package draft;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
        
	}
}
