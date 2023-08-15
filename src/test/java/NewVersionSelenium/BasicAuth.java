package NewVersionSelenium;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import java.net.URI;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Predicate;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Predicate<URI> uriPredicate= uri -> uri.getHost().contains("https://the-internet");
		((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}

}
