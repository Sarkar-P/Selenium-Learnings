import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// chrome.exe-> chromeDriver (Third party Chrome.exe is the third party to access the Chrome Driver
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver is the Interface that defines the methods to Automate and ChromeDriver is the is the class to access and implements the methods 
		
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/feed/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
