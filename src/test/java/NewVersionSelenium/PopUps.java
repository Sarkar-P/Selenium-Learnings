package NewVersionSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUps {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		Map<String,Object> contentSettings=new HashMap<String,Object>();
		Map<String,Object> profile=new HashMap<String,Object>();
		Map<String,Object> prefs=new HashMap<String,Object>();
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		//0=default,1=accept,2=deny
		//contentSettings.put("notification", 1); --for notification popup
//		options.addArguments("use-fake-device-for-media-stream"); ---for camera and microphone
//	    options.addArguments("use-fake-ui-for-media-stream");
		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs",prefs);
		

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new RemoteWebDriver(new URL(""),cap);
		driver.get("https://the-internet.herokuapp.com/geolocation");
	}

}
