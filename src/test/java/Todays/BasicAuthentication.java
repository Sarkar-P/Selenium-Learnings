package Todays;

import java.net.URI;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(400, 600);
		driver.manage().window().setSize(d);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Predicate<URI> uriPredicate=uri -> uri.getHost().contains("https://the-internet.herokuapp.com/");
		((HasAuthentication)driver).register( uriPredicate, UsernameAndPassword.of("sdada","casca"));

		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
