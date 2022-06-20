package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.nike.com/ca/");
		
		Thread.sleep(2000);
		
		WebElement menLink = driver.findElement(By.xpath("//a[@aria-label=\"Men\"]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(menLink).build().perform();
		
		Thread.sleep(1500);
		
		List<WebElement> shoeCol = driver.findElements(By.xpath("(//div[@class=\"pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2\"])[7]/a"));
		System.out.println(shoeCol.size());
		
		Thread.sleep(2000);
		
		for(WebElement ad: shoeCol) {
			System.out.println(ad.getText());
		}
	}

}
