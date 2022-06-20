package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class adidasss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(3000);
		driver.findElement(By.id("login-email")).sendKeys("aabshkbskjdskjdnkjs@email.com");
		driver.findElement(By.id("login-password")).sendKeys("sdhbshdbsjdnjsdnk");
		driver.findElement(By.xpath("//button[@aria-label='Log in']")).click();
	
		Thread.sleep(2000);
		
		String expected_error = "Your request timed out – please retry";
		String actual_error = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		
		if(actual_error.equals(expected_error)) {
			System.out.println("Test Passed");
			}
		else {System.out.println("Test failed");}
		
		
		
	}

}
