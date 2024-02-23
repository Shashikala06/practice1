package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class simple_form {
	WebDriver driver;
	@Given("User Opens the browser and navigate to v{int} training form website")
	public void user_Opens_the_browser_and_navigate_to_v_training_form_website(Integer v1) {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); 
	        driver.manage().window().maximize();
	        driver.get("https://v1.training-support.net/selenium/simple-form");
	       
	   
	}

	@When("User Enters Firstname, Last name, Email")
	public void user_Enters_Firstname_Last_name_Email() {
	   driver.findElement(By.id("firstName")).sendKeys("shashikala");
	   driver.findElement(By.id("lastName")).sendKeys("s m");
	   driver.findElement(By.id("email")).sendKeys("shahshi@gmail.com");
	  
	}

	@When("Contact Number, Message")
	public void contact_Number_Message() {
		 driver.findElement(By.id("number")).sendKeys("8776656546");
		   driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Hello");
		   
	}

	@When("Users clicks on Submit")
	public void users_clicks_on_Submit() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	@Then("A Confirmation popup is Displayed")
	public void a_Confirmation_popup_is_Displayed() {
	   System.out.println("clicked on submit");
	}

}
