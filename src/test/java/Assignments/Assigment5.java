package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("div[class='left-align'] #product"));
		List<WebElement> ls=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum=0;
		for(int i=0;i<driver.findElements(By.cssSelector(".table-display td:nth-child(3)")).size();i++)
		{
			sum=sum+Integer.parseInt(ls.get(i).getText());
		}
		System.out.println("Total sum :"+sum);
	}

}
