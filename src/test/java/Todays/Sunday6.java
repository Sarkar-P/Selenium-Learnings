package Todays;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday6 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int size=links.size();
		System.out.println(size);
		WebElement footerdriver=driver.findElement(By.cssSelector("#gf-BIG"));
		List<WebElement> newLinks=footerdriver.findElements(By.tagName("a"));
		int size1=newLinks.size();
		System.out.println(size1);
		WebElement coloumDriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		List<WebElement> links1=coloumDriver.findElements(By.tagName("a"));
		for(WebElement link:links1)
		{
			String url=link.getAttribute("href");
			HttpsURLConnection con=(HttpsURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int code=con.getResponseCode();
			System.out.println(code);
		}
	}

}
