package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {
	
	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	    	//code to navigate to login url
	    	System.out.println("navigated to login url");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("Logged in successfully");
	    	//code to login
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        //home page validation
	    	System.out.println("Validated homepage");
	    }
	    
	    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	      System.out.println(strArg1);
	      System.out.println(strArg2);
	    }


	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	
	    	//
	    	System.out.println(strArg1);
	    }

	}
