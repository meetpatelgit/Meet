package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		List<WebElement> yahooSideLinks = driver.findElements(By.xpath("//div[@class='bd']/div/div/div/a"));
		System.out.println(yahooSideLinks.size());
		for (int i=0;i<yahooSideLinks.size();i++) {
			System.out.println(yahooSideLinks.get(i).getText());
		}
		
	}

}
