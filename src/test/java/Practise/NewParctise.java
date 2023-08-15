package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewParctise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//div[@id='content']/ul//li/child::a[text()='Geolocation']")).click();
		driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		System.out.println(driver.findElement(By.cssSelector("#demo")).getText());
		

	}

}
