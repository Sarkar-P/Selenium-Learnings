package NewVersionSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new"); // new selenium feature has this 
		//option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println( driver.getTitle());
		
		

	}

}
