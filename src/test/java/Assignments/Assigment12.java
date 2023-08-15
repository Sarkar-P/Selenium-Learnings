package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		System.out.println(driver.switchTo().frame(0));
	}

}
