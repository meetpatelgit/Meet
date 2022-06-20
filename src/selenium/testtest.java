package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("aaejdnjendmeass");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("aaass");
		
		WebElement clickOnLogin = driver.findElement(By.name("login"));
		clickOnLogin.click();
		
	}	

}
