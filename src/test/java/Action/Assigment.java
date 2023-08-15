package Action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentId=it.next();
		String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
