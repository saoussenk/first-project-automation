package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		driver.manage().window().maximize();
		
		// store and print the name of the first window
		String Handle = driver.getWindowHandle();
		System.out.println(Handle);
		
		//click on the button new window message
		driver.findElement(By.id("messageWindowButton")).click();
		
		//Store and print the name of all window open
		Set<String> Handles = driver.getWindowHandles();
		System.out.println(Handles);
		
		//pass a window handle to another window 
		for(String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.quit();
		
		

	}

}
