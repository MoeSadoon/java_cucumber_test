package Cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;

public class StepDefinitions {
	
	WebDriver driver;
	
	
	@Given("^I am on the zoo page$")
	public void i_am_on_the_zoo_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/QA/Desktop/drivers/chromedriver");
		driver = new ChromeDriver();
	    driver.navigate().to("http://thetestroom.com/webapp/index.html");	    
	}

	@When("^I click on ([^\"]*)$")
	public void shouldClickOnLink(String link) throws Throwable {
	    driver.findElement(By.id(link)).click();
	}

	@Then("^the title should be ([^\"]*)$")
	public void shouldBeRightTitle(String title) throws Throwable {
	    Assert.assertTrue(driver.getTitle().equals(title));
	}
	
	@And("^I close the browser$")
	public void browserShouldClose(){
		driver.close();
	}
	
	//Below is the example for Scenario data tables
//	@Given("^I am on the zoo page$")
//	public void i_am_on_the_zoo_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "/Users/QA/Desktop/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.navigate().to("http://thetestroom.com/webapp/index.html");
//	}
//
//	@When("^I click on the contact page$")
//	public void i_click_on_the_contact_page() throws Throwable {
//	    driver.findElement(By.id("contact_link")).click();
//	}
//
//	@And("^I fill in the form with the following details$")
//	public void i_fill_in_the_form_with_the_following_details(DataTable table) throws Throwable {
//	    List<List<String>> data = table.raw();
//	    driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
//	    driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
//	    driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
//	    driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
//	}
//
//	@Then("^I check I am on the confirmation page$")
//	public void i_check_I_am_on_the_confirmation_page() throws Throwable {
//	    Assert.assertTrue(driver.getTitle().toString().equals("Contact Confirmation"));
//	}


}
