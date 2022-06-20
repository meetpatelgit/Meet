package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		
		//We can not verify if element is present or not, using WebElement. WebElement Must be present
		/*if(driver.findElement(By.linkText("AboutsDgsdfgherhf")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("Aboutsdgdsfhgerhssd"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}
		

	}

}
