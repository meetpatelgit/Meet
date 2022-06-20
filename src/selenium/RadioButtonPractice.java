package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12898\\Desktop\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		List<WebElement> radiolist = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radiolist.size());
		
				for (int i=0;i<radiolist.size();i++) {
				if (radiolist.get(i).isSelected()) {
				System.out.println(radiolist.get(i).getAttribute("Value")+"------"+radiolist.get(i).isSelected());	
				}
				}
				List<WebElement> radiolist2 = driver.findElements(By.xpath("//input[@name='group2']"));
				System.out.println(radiolist.size());
				
						for (int i=0;i<radiolist2.size();i++) {
						if (radiolist2.get(i).isSelected()) {
						System.out.println(radiolist2.get(i).getAttribute("Value")+"------"+radiolist2.get(i).isSelected());	
						}
						}
				
				
				
	}

}
