package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		driver.findElement(By.xpath("//input[@value='confirm box']")).click();
		Thread.sleep(2000);
		
		Alert allss = driver.switchTo().alert();
		System.out.println(allss.getText());
		
		allss.accept(); // click on the selected one
		// allss.dismiss(); // click on unselected one
		
	}

}
