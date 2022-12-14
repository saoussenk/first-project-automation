package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open firefox
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open application my store
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// maximize browser
		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();

		// fill  username 
		driver.findElement(By.id("email")).sendKeys("ziedhannachi0@gmail.com");

		// Thread.sleep(3000);

		// fill password
		driver.findElement(By.id("passwd")).sendKeys("Admin123");

		// click signin in button
		// driver.findElement(By.id("SubmitLogin")).click();

		// Click on signin button with explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnSubmitLogin;
		btnSubmitLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
		btnSubmitLogin.click();
		
		String contact = driver.findElement(By.id("contact-link")).getText();
		Assert.assertEquals("Contact us", contact);
		
		System.out.println("login Successfully");

		// close browser
		driver.quit();
		// driver.close();

	}

}
