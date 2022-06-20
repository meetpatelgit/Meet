package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliExpressHoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		
		List <WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		List <WebElement> popUp2 = driver.findElements(By.className("_24EHh"));
		
		if (popUp1.size()>0) {
			popUp1.get(0).click();
		}
		if (popUp2.size()>0) {
			popUp2.get(0).click();
		}
		
		driver.findElement(By.xpath("//input[@id='search-key']")).sendKeys("Computer");
		
		
		

	}

}
