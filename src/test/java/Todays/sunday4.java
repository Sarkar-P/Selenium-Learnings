package Todays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class sunday4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//WebElement radio1=driver.findElement(By.xpath("//label[@for='radio1']"));
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.cssSelector("#openwindow")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
	System.out.println(	driver.findElement(By.xpath("//div[contains(@class,'col-sm-6 col-md-8 hidden-xs video-banner')]/h3")).getText());
	driver.switchTo().window(parent);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=4000");
	List<WebElement> list=driver.findElements(By.xpath("//tbody/tr/td[4]"));
	System.out.println( list.get(0).getText());
	}

}
