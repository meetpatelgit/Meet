package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScotiabankTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\12898\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=H_IvSxw2IeU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiSF9JdlN4dzJJZVUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0OTk3NTcwNywiaWF0IjoxNjQ5OTc0NTA3LCJqdGkiOiI3YzgxZDY2Ni0xZDQ0LTRjYTctOTk3ZC1mZjM5YjNjMTMyZDIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.l21oMJppV8S3hO1U_OHwr8TPz5bPOseivnOHlKoxF6WjJJyXjDFWgp8sLZCgxggUIfDi0MmPtVD_lp7xTYWlxriET2rh8dyqz1tjIwCJtOcSB0WTYdqNBKew5ldurzWnFhSrMDqfq8_YiMiTqSJJBU0MxqZJXiPoA2B8SLVF5TY5-sP06ABqFIooOAKqh8E8KQRbXTGUYS5GrfzMEgayQ-dmav71_rq4zoMDTO38pxXr54yvZX3ZtunAvpZF_iKZcFyYPNMXSsZ0MBwiYQmuwK-p9ePf3_jX1FZyKPN6usoQRk7KocEPCLaazr-Wx_dj73XZjf21YZcrRsBtNvm3qg&preferred_environment=");
		driver.findElement(By.id("usernameInput-input")).sendKeys("amdkmdkfkmdlkfdlfldfl@^");
		driver.findElement(By.id("password-input")).sendKeys("amdkmdkfkmdlkfdlfldfl");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(7000);
		String expectedError = "Please enter a username or card number without special characters.";
		String actualError = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError);
		
		if (expectedError.equals(actualError)) {System.out.println("Test Passed");}
		else {System.out.println("Test failed");}
}
}  