package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends PagesParametrai {
	
	//1. lokatoriai
	
		By SukurtiNaujaPaskyra = By.linkText("Sukurti naują paskyrą");
		By EnterName = By.id("username");
		By EnterPassword = By.id("password");
		By ConfirmPassword = By.id("passwordConfirm");
		By SubmitNewRegistration = By.cssSelector("[type='submit']");
		By getErrorMessage1 = By.id("username.errors");
		By Prisijungti = By.xpath("/html/body/div/form/div/button");
		
		By EnterLoginName = By.xpath("/html/body/div/form/div/input[1]");
		By EnterLoginPassword = By.xpath("/html/body/div/form/div/input[2]");
		
		By getErrorMessage2 = By.xpath("/html/body/div/form/div/span[2]");
		
		By LogOut = By.xpath("/html/body/nav/div/ul[2]/a");
		

		//2.konstruktorius
		
		public Homepage (WebDriver driver) {
			this.driver=driver;
		}
		
		//3.metodai/funkcijos
		
		public void NavigateToNewRegistration() {
			driver.findElement(SukurtiNaujaPaskyra).click();
		}
		public void EnterNotUniqueDetails() {
			driver.findElement(EnterName).sendKeys("Lana");
		    driver.findElement(EnterPassword).sendKeys("Sudo");
		    driver.findElement(ConfirmPassword).sendKeys("Sudo");
		}
		
		public void SubmitNewRegistration() {
			driver.findElement(SubmitNewRegistration).click();
		}
		
		public String AlertMessage1() {
			return driver.findElement(getErrorMessage1).getText();
		}
		
		public void EnterUniqueDetails() {
			
			String name1=RandomStringUtils.random(2,true,false)+"Lana";
			driver.findElement(EnterName).sendKeys(name1);
		    driver.findElement(EnterPassword).sendKeys("Sudo");
		    driver.findElement(ConfirmPassword).sendKeys("Sudo");
			
		}
		
		public void EnterIncorrectDetails() {
			driver.findElement(EnterLoginName).sendKeys("Lana");
		    driver.findElement(EnterLoginPassword).sendKeys("");
		    
		}
		
		public void NavigateToLogin() {
			driver.findElement(Prisijungti).click();
			
		}
		
		public String AlertMessage2() {
			return driver.findElement(getErrorMessage2).getText();
		}
		
		public void EnterCorrectDetails() {
			driver.findElement(EnterLoginName).sendKeys("Lana");
		    driver.findElement(EnterLoginPassword).sendKeys("Sudo");
		    
		}
		public void LogOut() {
			driver.findElement(LogOut).click();
		}
		

}
