package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\new\\seleniumDemo\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dpt@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("D2");
		driver.findElement(By.linkText("Forgotten account?")).click();
	
		
	}

}
