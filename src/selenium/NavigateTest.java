package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.aliexpress.com/");
		
		driver.navigate().to("https://www.aliexpress.com/"); // same as above
		
//		driver.navigate().forward();  // forward button
//		driver.navigate().refresh(); // refreshes webpage
		driver.navigate().back(); // back button
		

	}

}
