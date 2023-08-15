package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class imDbSource {
	
	@Test
	public  void test() {

		/*
		 * This Test is Generic for every movie to fetch their Release Date and Country
		 * from imDb
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=vp_vi_tt");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> lists = driver.findElements(
				By.xpath("//section[@cel_widget_id='StaticFeature_Details']/div/following-sibling::div/ul/li"));

		String countryName=null;
		String releaseDate=null;
		for (WebElement list : lists) {
			String values = list.getText();
			if (values.contains("Country of origin")) {
				String[] formatted = values.split("origin");
				countryName = formatted[1].trim();
				System.out.println(countryName);
			}
			if (values.contains("Release date")) {
				String[] formatted1 = values.split("date");
			     releaseDate = formatted1[1];
				System.out.println(releaseDate);
			}

		}
		
	}
}
