package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliexpressSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		
		List <WebElement> closeButton = driver.findElements(By.xpath("//img[@class='btn-close']"));
		
		Thread.sleep(2000);
		List <WebElement> closeButton2 = driver.findElements(By.xpath("//img[@class='_24EHh']"));
		if (closeButton.size()>0) {
			closeButton.get(0).click();
		}
		
		if (closeButton2.size()>0) {
			closeButton2.get(0).click();
		}

		
		List <WebElement> menuList = driver.findElements(By.xpath("//div[@class=\"categories-list-box\"]/dl/dt/span/a"));
		System.out.println(menuList.size());
		
		for (WebElement aa: menuList) {
			System.out.println(aa.getText());
		}
	}

}
