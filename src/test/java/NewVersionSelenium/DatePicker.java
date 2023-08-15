package NewVersionSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.cssSelector(".makeFlex.noShrink.appendRight30 .ic_circularclose_grey")).click();
		String calenderMonth=driver.findElement(By.cssSelector(".DayPicker-Caption div")).getText();
		if(!calenderMonth.contains("April 2023"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		List<WebElement> dates=driver.findElements(By.cssSelector(".DayPicker-Week .DayPicker-Day"));
		for(WebElement date:dates)
		{
			String datePicker=date.getAttribute("aria-label");
			if(datePicker.equalsIgnoreCase("Thu Apr 20 2023"))
			{
				date.click();
			}
		}
		
	}

}
