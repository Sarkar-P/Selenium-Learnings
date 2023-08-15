package Calender;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("asda");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// how to take screenshots
		FileUtils.copyFile(src, new File("C:\\Users\\Priyanka\\screenshot.png"));// how to save the screenshot on your
																					// local

	}

}
