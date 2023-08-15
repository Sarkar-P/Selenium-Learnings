package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on the coloumn
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all the webelements into the List
		List<WebElement> ls = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all the WebElements in the new List

		List<String> original = ls.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort the original List

		List<String> sorted = original.stream().sorted().collect(Collectors.toList());

		// compare the Original List Vs actual
		Assert.assertTrue(original.equals(sorted));
		List<String> newList;

		// Scan the name coloumn with getText--> rice-->Print the price of the rice
		do {
			List<WebElement> ls1 = driver.findElements(By.xpath("//tr/td[1]"));
			newList = ls1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());
			newList.forEach(a -> System.out.println(a));

			if (newList.size() < 1) { // means no result found on the page
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (newList.size() < 1);
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
