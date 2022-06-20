
	package selenium;

	import java.time.Duration;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class FBdropdownRetry {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 Seconds-Max time
			
			
			driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
			
			WebElement daydropdown = driver.findElement(By.xpath("//select[@id='day']"));
			Select d = new Select(daydropdown);
			d.selectByValue("7");
			
			WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']"));
			Select m = new Select(monthdropdown);
			m.selectByValue("7");
	
			WebElement yeardropdown = driver.findElement(By.xpath("//select[@id='year']"));
			Select y = new Select(yeardropdown);
			y.selectByValue("2002");
			
			driver.findElement(By.xpath("//input[@value='2']")).click();
			
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			
			
			
			}
			
	}
