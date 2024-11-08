package serverest.product;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import serverest.BaseTest;
import serverest.Product;

import static io.restassured.RestAssured.given;

public class ProductRequests {
  public static Response createProduct(Product product, String accessToken) {
    RequestSpecification requestSpecification = BaseTest.requestSpecification(accessToken);

    return given()
      .spec(requestSpecification)
      .body(product)
      .when()
      .post("/produtos");
  }
}
