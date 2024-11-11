package serverest.support;

import enums.ProductStatus;
import factory.ProductDataFactory;
import io.cucumber.java.ParameterType;
import serverest.Product;

public class ParameterTypes {
  @ParameterType("valid|invalid")
  public Product productState(String productState) {
    return ProductDataFactory.createProduct(ProductStatus.valueOf(productState.toUpperCase()));
  }
}
