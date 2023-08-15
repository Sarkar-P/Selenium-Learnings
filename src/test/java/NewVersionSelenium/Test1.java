package NewVersionSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/alm/category/ref=s9_acss_ot_cg_MRLSBC_2b1_w?almBrandId=ctnow&node=4859482031&pf_rd_m=A1K21FY43GMZF8&pf_rd_s=alm-storefront-desktop-dram-top-1&pf_rd_r=G1N5Z1GGZ2CTFQC0WMP6&pf_rd_t=0&pf_rd_p=f957586e-c9d0-4cb1-a75a-72849a2dafd0&pf_rd_i=FMCDummyValue");	
		List<WebElement> products=driver.findElements(By.cssSelector(".a-carousel-card"));
		WebElement prod=products.stream().filter(a ->a.findElement(By.cssSelector(".a-truncate.a-size-small.a-text-normal .a-truncate-cut")).getText().equalsIgnoreCase("Tata Sampann Unpolished Toor Dal/ Arhar Dal, 1kg")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".a-button-input.qs-slider-atc-button-native")).click();
	}

}
