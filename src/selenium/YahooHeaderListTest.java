package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooHeaderListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		List<WebElement> YahooHeaderList = driver.findElements(By.xpath("//ul[@class=\"_yb_1yw2s _yb_1pyj0\"]/li/a"));
		System.out.println(YahooHeaderList.size());
		
		for (int i=0;i<YahooHeaderList.size();i++) {
			System.out.println(YahooHeaderList.get(i).getText());
		}

	}

}
