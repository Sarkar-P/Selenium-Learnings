package NewTopics;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		Map<String,Integer> contentSetting=new HashMap<String,Integer>();
		Map<String,Object> profile=new HashMap<String,Object>();
		Map<String,Object> pref=new HashMap<String,Object>();
		contentSetting.put("notifications", 2);
		profile.put("managed-default-content-settings",contentSetting );
		pref.put("profile", profile);
		options.setExperimentalOption("prefs", pref);
		WebDriver driver = new ChromeDriver(options);
        //options.addArguments("disable-notifications");
        Dimension d=new Dimension(400,600);
		driver.manage().window().setSize(d);
		driver.get("https://www.javacodemonk.com/sdet-rest-assured-interview-questions-bbefc7a3");
		
		
	}

}
