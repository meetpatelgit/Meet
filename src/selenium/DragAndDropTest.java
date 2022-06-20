package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBePresentInElement(droppable, "Dropped!"));
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
