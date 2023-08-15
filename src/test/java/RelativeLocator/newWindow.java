package RelativeLocator;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String>st=driver.getWindowHandles();
		Iterator<String> it=st.iterator();
		String Parent=it.next();
		String Child=it.next();
		
		driver.switchTo().window(Child);
		driver.get("https://courses.rahulshettyacademy.com/");
		String name=driver.findElements(By.cssSelector("//div[contains(text(),'Angular Fundamentals from Scratch & Unit/Integrati')]"))

        .get(1).getText();
		
		System.out.println(name);
		driver.switchTo().window(Parent);
		
	}

}
