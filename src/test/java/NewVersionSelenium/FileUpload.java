package NewVersionSelenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	// TODO Auto-generated method stub
	WebDriver driver;
	File folder;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();

		// chrome

		ChromeOptions option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		option.setExperimentalOption("prefs", prefs);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, option);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[8]"));
		Thread.sleep(3000);

		File[] listOfFiles = folder.listFiles();
		int size = listOfFiles.length;
		Assert.assertTrue(listOfFiles.length > 0);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		for (File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}

}
