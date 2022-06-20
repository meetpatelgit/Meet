package selenium;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.xpath("//input[@value=\"alert box\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		
		

	}

}
