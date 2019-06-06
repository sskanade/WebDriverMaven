package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty	("webdriver.gecko.driver", "C:\\Users\\Shlok\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("#login1")).sendKeys("sskanade");
		driver.findElement(By.cssSelector("#password")).sendKeys("Shlok@2009");
		driver.findElement(By.cssSelector("div.margTop10:nth-child(6) > div:nth-child(1) > input:nth-child(1)")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
