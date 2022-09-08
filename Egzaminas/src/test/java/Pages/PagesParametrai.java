package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesParametrai {
	protected WebDriver driver;
	
	   public void PagesParametrai(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}


}
