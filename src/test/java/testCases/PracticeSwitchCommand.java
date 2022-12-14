package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("https://demo.guru99.com/test/guru99home/");

		// maximize browser
		driver.manage().window().maximize();
		
		// switching the frame by id
		driver.switchTo().frame("a077aa5e");
		System.out.println("***we are swith to the iframe***");
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***we are done***");
		
		driver.close();

	}

}
