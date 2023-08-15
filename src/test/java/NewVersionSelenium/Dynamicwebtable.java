package NewVersionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_orderby.asp");
		int rowCount = driver.findElements(By.xpath("//*[@id=\"main\"]/div[4]/table/tbody/tr")).size();
		int coloumnCount = driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr/th"))
				.size();
		boolean flag = false;
		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <= coloumnCount; j++) {
				String name = driver
						.findElement(By.xpath("//*[@id=\"main\"]/div[4]/table/tbody/tr[" + (i + 1) + "]/td[" + j + "]"))
						.getText();
				if (name.contains("Mataderos 2312")) {
					flag = true;
					System.out.println(i + ":" + j);
					break;
				}
			}
		}
		if (flag) {
			System.out.println("found");
		}
	}
	
	

}
