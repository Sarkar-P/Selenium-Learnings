package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Action.Action;

public class Assigment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		//driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.cssSelector(".sc-1gu8y64-0.BbwkM.sc-1c1rgbd-0.hAcisp")).click();
		driver.findElement(By.cssSelector(".sc-f7phya-0.bpyVvo")).sendKeys("6290376057");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".sc-64ptou-0.iKjNnb.sc-jqmf1i-22.fLVjQf"))).click().build().perform();
		driver.findElement(By.cssSelector(".sc-64ptou-0.hYXypH")).click();
		
		
		
		}

}
