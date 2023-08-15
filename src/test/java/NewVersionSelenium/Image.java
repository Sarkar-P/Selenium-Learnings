package NewVersionSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> imageMap=new HashMap<>();
		imageMap.put("images", 2);
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("profile.default_content_setting_values", imageMap);
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
	   // options.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		List<WebElement> links=driver.findElements(By.xpath("//div[@data-tracking-id='Best of Electronics']//a"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			System.out.println(con.getResponseCode());
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='200%';");
	}

}
