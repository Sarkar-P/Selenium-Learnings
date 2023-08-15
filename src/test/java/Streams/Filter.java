package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//in the webPage filter with rice the result of the list and the previous list is same 
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		List<WebElement>list=driver.findElements(By.xpath("//tr/td[1]"));// return 5 results
		List<Object> s=list.stream().filter(a->a.getText().contains("Rice"))
				.collect(Collectors.toList());
		
		Assert.assertEquals(list.size(), s.size());
	}

}
