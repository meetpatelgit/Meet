package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CanadaDotCa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.canada.ca/");
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//header/nav[@id='wb-auto-2']/div[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[contains(text(),'My application')]")).click();
		Thread.sleep(1000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.linkText("Sign in or create an account")).click();

	}

}
