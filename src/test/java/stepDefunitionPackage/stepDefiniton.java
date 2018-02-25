package stepDefunitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import TestRunner.CucumberRunnerTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefiniton extends CucumberRunnerTest {
	
	@Given("^I navigate to google homepage$")
	public void i_navigate_to_google_homepage() {
	    driver.get("http://google.com");
        
	}

	@When("^I enter a keyword search$")
	public void i_enter_a_keyword_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("porsche");
	    
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^I should be able to see the title contains the keyword$")
	public void i_should_be_able_to_see_the_title_contains_the_keyword()  {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(driver.getTitle().contains("porsche"));
	}

}
