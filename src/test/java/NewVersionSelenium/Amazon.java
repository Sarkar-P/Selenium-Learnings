package NewVersionSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Dimension d=new Dimension(500,600);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("priyanka7sarkar@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Sarkarp@98");
		driver.findElement(By.cssSelector("#auth-signin-button")).click();
		//driver.findElement(By.xpath("//input[@name='rememberMe']")).click();		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Fresh']")).click();
		driver.findElement(By.xpath("//div[@class='bxc-grid__image bxc-grid__image--light']/a[@aria-label='RICE']")).click();
		List<WebElement> products=driver.findElements(By.cssSelector(".a-carousel-card"));
	WebElement prod=	products.stream().filter(product-> product.findElement(By.cssSelector(".a-truncate-cut"))
				.getText().equalsIgnoreCase("Aashirvaad Select Sharbati Atta, 5kg")).findFirst().orElse(null);
	prod.findElement(By.cssSelector("span[class='a-button-inner']")).click();
	driver.findElement(By.cssSelector("#nav-cart-count-container")).click();
	//List<WebElement> cartProd=driver.findElements(By.cssSelector(".sc-product-details"));
	//Boolean match=cartProd.stream().anyMatch(cartProds-> cartProds.getText().equalsIgnoreCase("Aashirvaad Select Sharbati Atta, 5kg"));
		//Assert.assertTrue(match);
	}

}
