package petstore_steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class StepDefinition {
	
	
	@Given("^I'm using the staging API environment \"([^\"]*)\"$")
	public void i_m_using_the_staging_API_environment(String arg1) {
		/*RestAssured.baseURI = "https://qa-petstore.herokuapp.com";
		SerenityRest.rest()
		.given()
		.when()
		.get("/api/pets")
		.then()
		.statusCode(200); */
		
		RestAssured.
        when().get("https://qa-petstore.herokuapp.com/api/pets").
        then().assertThat().statusCode(200);
     
		
	}

	private ResponseAwareMatcher<Response> is(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@When("^I make a GET request to \"([^\"]*)\"$")
	public void i_make_a_GET_request_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I get a response code of \"([^\"]*)\"$")
	public void i_get_a_response_code_of(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
