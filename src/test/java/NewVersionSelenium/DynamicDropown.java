package NewVersionSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Action.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textBox=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(textBox, "indi").build().perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@role='listbox'])[1]")));
		driver.findElement(By.xpath("(//li/div/div/div/div/span)[10]")).click();
	}

}
