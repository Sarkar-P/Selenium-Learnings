package Todays;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		ChromeDriver driver=new ChromeDriver(cap);
		
		driver.get("https://demo.guru99.com/test/login.html");

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String f=System.getProperty("user.dir")+"resources\\Priyanka.jpg";
		FileUtils.copyFile(src, new File(f));
	}

}
