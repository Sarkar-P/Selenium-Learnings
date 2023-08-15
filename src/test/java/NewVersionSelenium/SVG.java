package NewVersionSelenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://petdiseasealerts.org/forecast-map#/heartworm-canine/dog/united-states");
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null))
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("  setTimeout(function () {\r\n"
	    		+ "            window.scrollBy(0, 600);\r\n"
	    		+ "        },2);");
	    List<WebElement> frames=driver.findElements(By.cssSelector("iframe"));
	    System.out.println(frames.size());
        driver.switchTo().frame(frames.get(0));
	    String xpathEx="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
	   // String xpathExp="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='features']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
        List<WebElement>wcs= driver.findElements(By.xpath(xpathEx));
        for(WebElement wc:wcs)
        {
        	String ids=wc.getAttribute("id");
        	System.out.println(ids);
        	if(ids.equalsIgnoreCase("colorado"))
        	{
        		wc.click();
        	}
        }
      //  wcs.get(4).click();

	  
	   
		
	}

}
