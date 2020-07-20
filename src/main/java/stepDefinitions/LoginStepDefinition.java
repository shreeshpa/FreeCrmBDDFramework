package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("^user is already on Login page$")
	public void user_already_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/devashishgupta/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com");
		//driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(5000);
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println(title);
		//Thread.sleep(5000);
		//Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
		//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
	}
	
	@Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String hometitle=driver.getTitle();
		System.out.println("Home Page title ::"+ hometitle);
		Assert.assertEquals("CRMPRO", hometitle);
	    
	}
	

}
