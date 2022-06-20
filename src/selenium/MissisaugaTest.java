package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissisaugaTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.mississauga.ca/");
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//button[@aria-label='No thank you, will close the dialog']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		List<WebElement> listOurOrg = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']//a"));
		System.out.println(listOurOrg.size());
		Thread.sleep(3000);
		
		for (int i=0;i<listOurOrg.size();i++) {
			System.out.println(listOurOrg.get(i).getText());
			if(listOurOrg.get(i).getText().equals("Jobs and volunteer")) {
				break;
				
			}
		}

	}

}
