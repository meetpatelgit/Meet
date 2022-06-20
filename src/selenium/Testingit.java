package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testingit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
