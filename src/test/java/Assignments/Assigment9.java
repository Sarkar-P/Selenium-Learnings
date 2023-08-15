package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assigment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		//Explicit wait
		
		driver.findElement(By.cssSelector(".customradio:nth-child(2) .checkmark")).click();
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement dropDown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(dropDown);
		s.selectByIndex(2);
		driver.findElement(By.cssSelector("#terms")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signInBtn")));
		driver.findElement(By.cssSelector("#signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='nav-link btn']")));
		List<WebElement> ls=driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		for(int i=0;i<ls.size();i++)
		{
			ls.get(i).click();
		}
		driver.findElement(By.cssSelector("a[class*='nav-link btn']")).click();
	}

}
