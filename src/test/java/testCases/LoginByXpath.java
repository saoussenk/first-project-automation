package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginByXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		
		// open chrome
		WebDriver driver = new ChromeDriver();

		// open application my store
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// maximize browser
		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();

		// fill user name
		driver.findElement(By.xpath("//input[@name='email'}")).sendKeys("ziedhannachi0@gmail.com");

		// fill password
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Admin123");

		// click signin in button
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();

		//System.out.println("login Successfully");

		// close browser
		driver.quit();

	}

} 
