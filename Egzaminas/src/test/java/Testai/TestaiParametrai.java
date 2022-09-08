package Testai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestaiParametrai {
	
protected static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		//System.setProperty("webdriver.chrome.whitelistedIps", "");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
	    driver.navigate().to("http://localhost:8080/prisijungti");
	    driver.manage().window().maximize();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
