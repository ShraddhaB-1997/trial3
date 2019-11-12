package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy2 
{
	WebDriver driver;
	@Given("User opens IE and launches the application")
	public void user_opens_IE_and_launches_the_application() 
	{
		 System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8083/TestMeApp");
		  
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() 
	{
			 driver.findElement(By.linkText("SignIn")).click();
			 Assert.assertTrue(driver.getTitle().contains("Login"));
	}

	@When("user enters the user name as {string} in username field")
	public void user_enters_the_user_name_as_in_username_field(String uname) 
	{
		 System.out.println("UserName");
		   driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@When("user enters the password as {string} in password field")
	public void user_enters_the_password_as_in_password_field(String pwd) 
	{
			System.out.println("Password");
		   driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("login is succesful")
	public void login_is_succesful() 
	{
	   Assert.assertTrue(driver.getTitle().contains("Home"));
	}

}
