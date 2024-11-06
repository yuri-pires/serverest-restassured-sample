package serverest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.Authentication;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductStepDefinition {
  private String accessToken;

  @Before
  public void before() {
    Authentication authentication = new Authentication();
    baseURI = "https://serverest.dev";
    accessToken = authentication.getAccessToken();
  }

  @Given("I have the access to the ServeRest")
  public void i_have_the_access_to_the_serve_rest() {
    assertNotNull(accessToken);
    assertThat(accessToken, startsWith("Bearer"));
  }

  @When("Send a POST request to the \\/products endpoint with a valid Product object")
  public void send_a_post_request_to_the_products_endpoint_with_a_valid_product_object() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("System shoul create a new Product")
  public void system_shoul_create_a_new_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("I should receive on the answer the Product ID")
  public void i_should_receive_on_the_answer_the_product_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}
