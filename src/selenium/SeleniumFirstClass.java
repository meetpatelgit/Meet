package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.adidas.ca/en/account-login");
		driver.findElement(By.id("login-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("qwerty22");
//		driver.findElement(By.type("//*[@submit];
	}
}
