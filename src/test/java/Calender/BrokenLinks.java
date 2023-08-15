package Calender;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Step 1: to get all the links of the web Page
		//step2: to get the status code of that link by using java method
		//step3: if the status codes are greater than 400 then it is broken links
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		for(WebElement link:links) {
			
			String url= link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();//openConnection is a Java method to get the Status code of the URL
			con.setRequestMethod("HEAD");
			con.connect();
			int resValue=con.getResponseCode();
			System.out.println(resValue);
			a.assertTrue(resValue<400,"The link with text"+link.getText()+"is broken with code"+resValue);
					
		}
		
		

	}

}
