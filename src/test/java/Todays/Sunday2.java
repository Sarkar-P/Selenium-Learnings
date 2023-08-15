package Todays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.DOWN);
		System.out.println( driver.findElement(By.xpath("//input[@name='q']")).getAttribute("name"));
	}

}
