package RelativeLocator;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String[] expectedArray= {"Fresh Onion","Fresh Garlic","Fresh Bhendi"};
		

		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.linkText("Fresh")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='parentCarousel-desktop-alm-storefront_RegionalTrendingItems-ctnow'] h2[class='a-carousel-heading a-inline-block a-text-bold']")).getText());
		
		List<WebElement> items=driver.findElements(By.cssSelector(".a-color-link"));
		int j = 0;
		for(int i=0;i<items.size();i++)
		{
			String[] name=items.get(i).getText().split(",");
			String formattedname=name[0].trim();
			
			List<String> newList=Arrays.asList(expectedArray);
			if(newList.contains(formattedname))
			{
				j++;
				
				driver.findElement(By.cssSelector(".a-button-input.qs-slider-atc-button-native")).click();
				if(j==3)
					break;
			}
		}
	}

}
