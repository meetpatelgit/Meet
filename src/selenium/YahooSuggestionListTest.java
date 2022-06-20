package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("ybar-sbq")).sendKeys("Canada");
		Thread.sleep(2000);
		List<WebElement> yahooSug = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(yahooSug.size());
		
		for (WebElement dd: yahooSug) {
			System.out.println(dd.getText());
			
		}
	}

}
