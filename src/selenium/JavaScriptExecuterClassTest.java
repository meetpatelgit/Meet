package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.adidas.ca/en");
		
		Thread.sleep(6000);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;


		WebElement gg = driver.findElement(By.xpath("//span[contains(text(),'Careers')]/.."));
//		Method 1:
//		jse.executeScript("window.scrollBy(0,5000)");
		
//		Method 2:
//		jse.executeScript("arguments[0].scrollIntoView(true);",gg);
//		gg.click();
		
//		Method 3:
		jse.executeScript("arguments[0].click();",gg);
//		jse.executeScript("arguments[0].value = 'dhbdjsnk';",gg); To type

	}

}
