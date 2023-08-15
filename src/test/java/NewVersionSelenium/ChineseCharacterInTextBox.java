package NewVersionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChineseCharacterInTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("locale", "en_US");
		driver.get("https://app.hubspot.com/login");
		driver.findElement(By.cssSelector("#username")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Priyanka");
	}

}
