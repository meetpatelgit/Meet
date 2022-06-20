package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		List <WebElement> ebaySug = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(ebaySug.size());
		
		Thread.sleep(2000);
		for(WebElement ff: ebaySug)
		{ System.out.println(ff.getText());
	}

}
}
