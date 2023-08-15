package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys(Keys.DOWN);
		System.out.println( driver.findElement(By.cssSelector("#autosuggest")).getAttribute("value"));
	}

}
