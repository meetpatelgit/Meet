package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonHoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		WebElement accAndList = driver.findElement(By.id("nav-link-accountList"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(accAndList).build().perform();
		
		List<WebElement> accAndListDrop = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(accAndListDrop.size());
		
		for(WebElement ss: accAndListDrop) {
			System.out.println(ss.getText());
		}
		
	
	}

}
