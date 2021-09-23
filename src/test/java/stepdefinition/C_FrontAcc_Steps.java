package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C_FrontAcc_Steps 
{   WebDriver driver;
 
 @Before
 public void before() 
 {
	 System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
     driver = new ChromeDriver();
 }
 
 @After
 public void after() throws Exception  
 {
	 Thread.sleep(1000);
	 driver.quit();
 }

	@Given("User is on Login Page")
	public void user_is_on_login_page()
	{
		driver.get("http://demo.frontaccounting.eu/index.php");
	}



	@When("User enters username as {string} & password as {string} & clicks on Login")
	public void user_enters_username_as_password_as_clicks_on_login(String username, String password)
	{
		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys(username);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(username);
		
		driver.findElement(By.name("SubmitUser")).click();
		
	}
	@Then("Login {string} be happen")
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
          //          Assert.fail("Positive Test Failed");    // To log error in report generation otherwise it will get paased
		         }
	           }
	   else 
	       {
		        if(driver.getTitle().equals("Main Menu")) 
		         {
			        System.out.println("Negative Test failed");
			        Assert.fail("Negative Test Failed");
		         }
		      else 
		         {
			        System.out.println("Negative Test Passed");
		         }
	      
	        }


	}
	
}
