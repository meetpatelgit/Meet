package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\12898\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abserrtfffddxcd");
		driver.findElement(By.id("pass")).sendKeys("laasdfvcxdsela");
		driver.findElement(By.name("login")).click();


			
	}

}
