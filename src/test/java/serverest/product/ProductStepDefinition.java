package serverest.product;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import serverest.Product;
import serverest.support.Authentication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProductStepDefinition {
  private String bearerToken;
  private Response response;

  @Before
  public void setup() {
    bearerToken = Authentication.getAccessToken();
  }

  @Given("I have access to the ServeRest")
  public void i_have_the_access_to_the_serve_rest() {
    assertThat(bearerToken, startsWith("Bearer"));
  }

  @When("I send a POST request to the products endpoint with a {productState} product")
  public void i_send_a_post_request_to_the_products_endpoint_with_a_product(Product product) {
    response = ProductRequests.createProduct(product, bearerToken);
  }
  
  @Then("The system should create a new Product")
  public void the_system_should_create_a_new_product() {
    response.then()
      .statusCode(is(201))
      .body("message", equalTo("Cadastro realizado com sucesso"));
  }

  @And("I should receive on the answer the Product ID")
  public void i_should_receive_on_the_answer_the_product_id() {
    response.then()
      .body("_id", is(notNullValue()));
  }
}
