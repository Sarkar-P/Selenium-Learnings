package NewVersionSelenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteAsyncScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
         
         jse.executeAsyncScript("window.setTimeout(function(){alert('world');},4000);alert('Hello');");
	}

}
