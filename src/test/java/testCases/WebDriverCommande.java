package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommande {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get("url");

		driver.manage().window().maximize();
		
		String titlePage = driver.getTitle();
		
		System.out.println("The title of the page is: +titlePage");
		System.out.println("The Length of the title page is +titleLength");
		
	}

}
