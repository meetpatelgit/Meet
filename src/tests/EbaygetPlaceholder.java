package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaygetPlaceholder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String aa = driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");
		System.out.println(aa);
		
	}

}
