package draft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99Telecom {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Add Customer")).click();
		

	}

}
