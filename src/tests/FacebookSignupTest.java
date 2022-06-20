package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Meet");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abcdhfjsksjdm@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abcdhfjsksjdm@gmail.com");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("abcdeee234!");
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click(); 


	}

}
