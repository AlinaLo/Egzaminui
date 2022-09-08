package Testai;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;





public class Test1 extends TestaiParametrai {
	
	@Test 
	public void NotUniqueRegistration() {
		//driver.navigate().to("http://localhost:8080/prisijungti");
		Homepage home = new Homepage(driver);
		home.NavigateToNewRegistration();
		home.EnterNotUniqueDetails();
		home.SubmitNewRegistration();
		
		String a = home.AlertMessage1();
		System.out.println(a);
		Assert.assertEquals(a,"Toks vartotojo vardas jau egzistuoja");
		System.out.println("testas pavyko!"); 
		
	}
	
	@Test
	public void UniqueRegistraion() {
		driver.navigate().to("http://localhost:8080/prisijungti");
		Homepage home = new Homepage(driver);
		home.NavigateToNewRegistration();
		home.EnterUniqueDetails();
		home.SubmitNewRegistration();
		
		System.out.println("Successful Registration!");
		
	}
	
	@Test
	public void IncorrectLogin() {
		driver.navigate().to("http://localhost:8080/prisijungti");
		Homepage home = new Homepage(driver);
		home.EnterIncorrectDetails();
		home.NavigateToLogin();
		
		String b = home.AlertMessage2();
		System.out.println(b);
		Assert.assertEquals(b,"Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi");
		System.out.println("testas vel pavyko!"); 
	}
	
	@Test
	public void CorrectLogin() {
		driver.navigate().to("http://localhost:8080/prisijungti");
		Homepage home = new Homepage(driver);
		home.EnterCorrectDetails();
		home.NavigateToLogin();
		
		System.out.println("Successful Login!");
	}
	

	@Test
	public void LogOut() {
		Homepage home = new Homepage(driver);
		home.LogOut();
		
		System.out.println("Successful LogOut!");
	}
	
	

}
