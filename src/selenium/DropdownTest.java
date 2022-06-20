package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	List<WebElement> dropdown =  driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
	System.out.println(dropdown.size());
	for(int i=0;i<dropdown.size();i++) {
		System.out.println(dropdown.get(i).getText());
	}
	}

}
