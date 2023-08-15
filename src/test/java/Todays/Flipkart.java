package Todays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		WebElement form=driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		form.sendKeys("priyanka");
		form.sendKeys(Keys.ARROW_DOWN);
		form.sendKeys(Keys.ARROW_DOWN);
		form.sendKeys(Keys.ARROW_DOWN);
		form.sendKeys(Keys.ENTER);
		
		
	}

}
