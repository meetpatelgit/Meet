package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.titleContains("Google - About Google, Our Culture & Company News"));
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Passed");
		}
		else {System.out.println("Test Failed");};
		
		String expectedURL = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualURL = driver.getCurrentUrl();
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Passed");
		}
	}

}
