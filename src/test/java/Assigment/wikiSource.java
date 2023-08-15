package Assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wikiSource {

	@Test
	public  void test1() {

		/*
		 * This Test is Generic for every movie to fetch their Release Date and Country from Wiki
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		int rowCount = driver.findElements(By.xpath("//table[@class='infobox vevent']/tbody/tr")).size();
		System.out.println(rowCount);

		String countryName1=null;
		String releaseDate1=null;
		for (int i = 1; i < rowCount; i++) {

			String value = driver
					.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[" + i + "]"))
					.getText();
			// System.out.println(value);
			if (value.contains("Country")) {
				String[] formatted = value.split(" ");
				 countryName1 = formatted[1];
				System.out.println(countryName1);
			} else if (value.contains("Release date")) {
				String[] formatted1 = value.split("date");
				releaseDate1 = formatted1[1];
				System.out.println(releaseDate1);
			}
		}
	}

}
