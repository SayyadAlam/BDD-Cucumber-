package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination 
{
  WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	    
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		
	    
	    
	}

	
	@When("user enter correct username and password")
	public void user_enter_correct_username_and_password() throws InterruptedException 
	{
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		
		
	    Thread.sleep(3000);
	}

	
	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException 
	{
	   
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	    
		Thread.sleep(3000);
	}
	

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() 
	{
	    driver.getCurrentUrl();
	    
	    driver.close();
	    
	    
	}
	
}
