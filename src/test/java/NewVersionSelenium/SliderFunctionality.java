package NewVersionSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderFunctionality {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		WebElement textBox=driver.findElement(By.cssSelector("._3704LK"));
		Actions a=new Actions(driver);
		//a.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		a.moveToElement(textBox).click().sendKeys("mobile"+Keys.ENTER).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div div[class='_31Kbhn _28DFQy'] div[class='_3FdLqY']")));
		WebElement low=driver.findElement(By.cssSelector("div div[class='_31Kbhn _28DFQy'] div[class='_3FdLqY']"));
		int width=low.getSize().getWidth();
		a.dragAndDropBy(low, width*3,0).build().perform();
		
		

		

	}

}
