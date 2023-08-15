package NewVersionSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognitomode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, option);
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
	}

}
