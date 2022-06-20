package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(2000);
		List<WebElement> daydropdown = driver.findElements(By.xpath("//select[@id='day']/option")).selectByVisibleText()
		System.out.println(daydropdown.size());
		for (int i=0;i<daydropdown.size();i++) {
			System.out.println(daydropdown.get(i).getText()+"-------------"+ daydropdown.get(i).isSelected() );
		}
		
		List<WebElement> monthdropdown = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(monthdropdown.size());
		for (int i=0;i<monthdropdown.size();i++) {
			System.out.println(monthdropdown.get(i).getText()+ "--------------" + monthdropdown.get(i).isSelected() );
			}
		
		
		}
		
}
