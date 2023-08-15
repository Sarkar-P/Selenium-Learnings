package Ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vegetables {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebDriverWait w=new WebDriverWait(driver,5);
		
		String[] itemNeeded = { "Brocolli", "Cucumber", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		
      addItem(driver,itemNeeded);
      
      
     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
     driver.findElement(By.cssSelector("button.promoBtn")).click();
    
     
    
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		 System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	public static void addItem(WebDriver driver,String[] itemNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// change array to arraylist
			List itemNeededList = Arrays.asList(itemNeeded);

			int j = 0;
			if (itemNeededList.contains(formattedName)) {
				// click on Add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length)
					break;
			}
		}
	}

}
