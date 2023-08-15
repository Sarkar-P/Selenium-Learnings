package NewVersionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
//		options.addArguments("--disable-popup-blocking");
//		options.addArguments("--disable-extensions");
//		options.addArguments("--make-default-browser");
//		options.addArguments("--version");
//		options.addArguments("--disable-infobars");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		WebElement more=driver.findElement(By.cssSelector(".exehdJ"));
		Actions a=new Actions(driver);
		a.moveToElement(more).click().build().perform();
		
	}

}
