package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator <String> abcd = allWindows.iterator();
		String parentWindowaa = abcd.next();
		String childWindowaa = abcd.next();
		
		driver.switchTo().window(parentWindowaa);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindowaa);
		System.out.println(driver.getTitle());
		
	}

}
