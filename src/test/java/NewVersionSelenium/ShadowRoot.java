package NewVersionSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement text=(WebElement) js.executeScript("return document.querySelector('my-paragraph').querySelector('span')");
		System.out.println(text.getText());
	}

}
