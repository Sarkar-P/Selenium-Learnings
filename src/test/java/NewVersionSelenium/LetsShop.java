package NewVersionSelenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client");
		//String productName="zara coat 3";
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("priyanka7sarkar@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Priyanka@24");
		driver.findElement(By.cssSelector("#login")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".offset-sm-1")));
		List<WebElement> products=driver.findElements(By.cssSelector(".offset-sm-1"));
		
		WebElement prod=products.stream().filter(product-> product.findElement(By.cssSelector("b"))
				.getText().equalsIgnoreCase("zara coat 3")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".btn.w-10.rounded:last-of-type")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//.ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[4]/button[contains(@routerlink,'cart')]")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul/li[4]/button[contains(@routerlink,'cart')]")).click();
		List<WebElement> cartProds=driver.findElements(By.cssSelector(".cartWrap.ng-star-inserted"));
		boolean match=cartProds.stream().anyMatch(cartProd-> cartProd.findElement(By.cssSelector("h3"))
				.getText().equalsIgnoreCase("zara coat 3"));
		
		Assert.assertTrue(match);
		
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();	

	}

}
