package stepDefination;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontSteps {
	WebDriver driver;
	@Before
	public void before()
	{
		   System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		   driver = new ChromeDriver();
	}
	@After
	public void after()throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page()
	{   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.frontaccounting.eu/index.php");
		
	}
	
	
	
	@When("user enters username as {string} & password as {string}")
	public void user_enters_username_as_password_as(String uname, String pwd)
	{
		
		driver.findElement(By.name("user_name_entry_field")).clear();
		
		driver.findElement(By.name("user_name_entry_field")).sendKeys(uname);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
	}
	@Then("login {string} be happen")
	public void login_be_happen(String status)
	{
		 if(status.equals("should"))
		 {
			 if(driver.getTitle().equals("Main Menu"))
			 {
				 System.out.println("Positive Test Pass");
			 }
			 else
			 {
				 System.out.println("Positive Test Failed");
				 
			 }
	  
		 }
		 else if(driver.getTitle().equals("Main Menu"))
{
	System.out.println("Negative Test Failed");
	
}
		 else {
			 System.out.println("Negative Test Pass");
		 }
		 }
	}

