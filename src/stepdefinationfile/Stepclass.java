package stepdefinationfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepclass 
{
	
	WebDriver driver;
	
	@Given("^User open chrome browser$")
	public void user_open_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\rameshsoft\\workspace\\cucumberwithdatadriven_without examples\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(5000);	
	}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_and(String x, String  y) throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(x); 
		driver.findElement(By.id("pass")).sendKeys(y);
	}
	
	@Then("^Open user account sucessfully$")
	public void open_user_account_sucessfully() throws Throwable {
	  
	}

	@Then("^logout user account$")
	public void logout_user_account() throws Throwable {
	   
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

}
