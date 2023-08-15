package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh");
		List<WebElement>list=driver.findElements(By.cssSelector(".a-button-input.qs-slider-atc-button-native"));
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
		}
		LogEntries entry=driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs=entry.getAll();
		for(LogEntry e:logs)
		{
			System.out.println(e.getMessage());
		}
	}

}
