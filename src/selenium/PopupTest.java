package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);
		List <WebElement> popUp = driver.findElements(By.xpath("//*[@class='btn-close']"));
		if(popUp.size()>0) {
			driver.findElement(By.xpath("//*[@class='btn-close']")).click();
		}
		
		Thread.sleep(2000);
		
		List <WebElement> popUp2 = driver.findElements(By.xpath("//*[@class='_24EHh']"));
		if(popUp2.size()>0) {
			driver.findElement(By.xpath("//*[@class='_24EHh']")).click();
		}
		

	}

}
