package NewVersionSelenium;

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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement>links =driver.findElements(By.cssSelector(".example img"));
		SoftAssert sf=new SoftAssert();
		for(WebElement link: links)
		{
			String imageLink=link.getAttribute("src");
			HttpURLConnection con=(HttpURLConnection)new URL(imageLink).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int code=con.getResponseCode();
			System.out.println(code);
			sf.assertEquals(code<400, "the links are not broken"+link.getText()+code);
			
		}
	}

}
