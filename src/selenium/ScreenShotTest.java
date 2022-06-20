package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("C:\\Users\\12898\\Desktop\\Testing\\screenShot.png"));
	}

}
