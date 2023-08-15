package NewVersionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_alter.asp");
		WebElement element=driver.findElement(By.xpath("//a[@title='CSS Tutorial']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView()",element);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
