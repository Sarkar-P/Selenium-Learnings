import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertFalse(driver1.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver1.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver1.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver1.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);
		   int i=1;
		   while(i<5) {
			   driver1.findElement(By.id("hrefIncAdt")).click();//4 times

			   i++;
		   }
		   System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		   
		   //Assert.assertEquals(driver1.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		   System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		   driver1.close();
		   
	}

}
