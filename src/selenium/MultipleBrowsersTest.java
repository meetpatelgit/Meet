package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\12898\\Desktop\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		WebDriver driver;
		
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.safari.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
		
		driver.get("https://www.amazon.ca/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();

	}

}
