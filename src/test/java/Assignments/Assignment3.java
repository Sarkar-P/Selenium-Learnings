package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(staticDropdown);
		s.selectByIndex(2);
		//System.out.println(((WebElement) s.getAllSelectedOptions()).getText());
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
