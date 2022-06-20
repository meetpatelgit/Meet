package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortt = driver.findElements(By.xpath("//a[contains(text(),'Sortable')]"));
		
		if(sortt.size()>0) {
		System.out.println(" Element Present");
		
		}
		else {System.out.println("Element not present");}
		
		Thread.sleep(2000);
		
		
		List<WebElement> dropp = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		if(dropp.size()>0) {
		System.out.println(dropp.size()+"---- Element Present");
		
		}
		else {System.out.println("Element not present");}

		

	}

}
