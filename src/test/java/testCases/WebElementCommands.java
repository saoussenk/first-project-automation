package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement username = driver.findElement(By.name("username"));
		
		String attValue = username.getAttribute("name");
		System.out.println("The Attribute value is : " +attValue);
		
		driver.findElement(By.name("password")).clear();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Admin123");
		
		Dimension dimentions = username.getSize();
		System.out.println("Hight" +dimentions.height + "Widh" +dimentions.width);
		
		Point point = password.getLocation();
		System.out.println("X cordinate " +point.x + "Y cordinate" +point.y );
		
		//verifier si le bouton login affiché vrai / faux 
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = btnLogin.isDisplayed();
		System.out.println(result);
		
		//verifier si le bouton login activé vrai / faux 
		boolean status1 = btnLogin.isEnabled();
		System.out.println(status1);
		
		//vérifier si le bouton login existe vrai / faux 
		List <WebElement> btnLogin1 = driver.findElements(By.xpath("//button[@type='submit']"));
		if(btnLogin1.size() !=0) {
			System.out.println("The button is exist");
		}else {
			System.out.println("The button does not exist ");
		}
		
	}

}
