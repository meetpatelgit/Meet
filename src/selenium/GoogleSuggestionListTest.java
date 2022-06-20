package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Canada");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@role='listbox']/li") , 0));
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		System.out.println(suggestion.size());
		
		for (WebElement aa: suggestion) {
			System.out.println(aa.getText());
		}

	}

}
