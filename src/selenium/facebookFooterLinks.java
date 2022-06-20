package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> fbfooterlinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println(fbfooterlinks.size());
		
		for(int i=0;i<fbfooterlinks.size();i++) {
			System.out.println(fbfooterlinks.get(i).getText());
		}
	}

}
