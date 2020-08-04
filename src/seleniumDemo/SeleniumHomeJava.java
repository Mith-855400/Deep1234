/**
 * 
 */
package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author shatabdi
 *
 */
public class SeleniumHomeJava {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\new\\seleniumDemo\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();

}
