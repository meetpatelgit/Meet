package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHeaderLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		List<WebElement> YahooHeaderList = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(YahooHeaderList.size());
		
		for (int i=0;i<YahooHeaderList.size();i++) {
			System.out.println(YahooHeaderList.get(i).getText());
	}
	}
}
