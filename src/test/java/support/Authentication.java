package support;

import serverest.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Authentication {
  public static String getAccessToken() {
    User user = new User("yuri@qa.com.br", "teste");

    return given()
      .header("Content-Type", "application/json")
      .body(user)
      .when()
      .post("https://serverest.dev/login")
      .then()
      .log().all()
      .statusCode(200)
      .body("message", equalTo("Login realizado com sucesso"))
      .extract()
      .path("authorization");
  }
}
