package NewVersionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
	
		int rowCount=driver.findElements(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr")).size();
		int coloumnCount=driver.findElements(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr/td")).size();
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<=coloumnCount;j++)
			{
				String vegName=driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(vegName.equalsIgnoreCase("Cauliflower - 1 Kg"))
				{
					System.out.println(i+":"+j);
				}
			}
		}
	}

}
