0

package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore/al-marhaba-fresh-chicken-wilson-garden-shanti-nagar");
		List<WebElement> list=driver.findElements(By.cssSelector(".sc-10mkyz7-0.sc-1lv858r-2.jEeuYs"));
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
			break;
		}
		driver.findElement(By.cssSelector(".sc-59cghl-0.sc-1lv858r-3.cvTPOu")).click();
		driver.findElement(By.cssSelector(".sc-1115q80-0.sc-1pm8vvt-5.kiNomo")).click();

	}

}
