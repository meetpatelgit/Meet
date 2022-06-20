package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //About
		
		driver.navigate().back();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle()); //Google
		
		driver.navigate().forward();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //About
	}

}
