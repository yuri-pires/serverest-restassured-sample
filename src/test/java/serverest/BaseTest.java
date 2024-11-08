package serverest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
  public static RequestSpecification requestSpecification(String bearerToken) {

    RequestSpecBuilder specBuilder = new RequestSpecBuilder();
    specBuilder.setBaseUri("https://serverest.dev");
    specBuilder.addHeader("Authorization", bearerToken);
    specBuilder.setContentType(ContentType.JSON);
    specBuilder.addFilter(new RequestLoggingFilter());
    specBuilder.addFilter(new ResponseLoggingFilter());

    return specBuilder.build();
  }
}
