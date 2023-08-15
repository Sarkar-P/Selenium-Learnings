package RelativeLocator;

import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement RadioButton=driver.findElement(By.cssSelector("#inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(RadioButton)).getText());
		driver.findElement(with(By.tagName("label")).above(RadioButton)).getText();
	}

	

}
