package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement electronics = driver.findElement(By.linkText("Electronics"));

		Actions wawa = new Actions(driver);
		wawa.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> topCat = driver.findElements(By.xpath("//*[@aria-label='Top Categories']//a"));
		
		for (int i=0;i<topCat.size();i++) {
			if(topCat.get(i).isDisplayed()) {
			System.out.println(topCat.get(i).getText());
		}
		}
	}

}
