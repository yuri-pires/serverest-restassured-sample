package serverest.product;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import serverest.Product;

public class ProductRequests {

  public static RequestSpecification productRequestSpecification(Product product, String accessToken) {
    RequestSpecBuilder builder = new RequestSpecBuilder();
    builder.addFilter(new RequestLoggingFilter());
    builder.addFilter(new ResponseLoggingFilter());
    builder.addHeader("Content-Type", ContentType.JSON.toString());
    builder.addHeader("Authorization", accessToken);
    builder.setBody(product);

    return builder.build();
  }
}
