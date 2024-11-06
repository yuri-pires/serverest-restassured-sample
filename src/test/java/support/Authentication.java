package support;

import pojo.UserPojo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Authentication {
  public String getAccessToken() {
    UserPojo user = new UserPojo("yuri@qa.com.br", "teste");

    return given()
      .header("Content-Type", "application/json")
      .body(user)
      .when()
      .post("/login")
      .then()
      .statusCode(200)
      .body("message", equalTo("Login realizado com sucesso"))
      .extract()
      .path("authorization");
  }
}
