package NewVersionSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector(".ic_circularclose_grey:nth-child(1)")).click();
		WebElement radioButton=driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[1]"));
		radioButton.click();
		Boolean flag=radioButton.isDisplayed();
		System.out.println(flag);
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity')]")).click();
		WebElement form=driver.findElement(By.xpath("//input[@autocomplete='off']"));
		Actions a=new Actions(driver);
		a.sendKeys(form, "Beng");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("react-autowhatever-1")));
		driver.findElement(By.cssSelector("webklipper-publisher-widget-container-notification-close-div"));
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	}

}
