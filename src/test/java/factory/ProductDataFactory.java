package factory;

import enums.ProductStatus;
import serverest.Product;

import java.util.UUID;

public class ProductDataFactory {
  public static Product createProduct(ProductStatus productStatus) {
    if (productStatus != ProductStatus.VALID) {
      return new Product("Playstation", 456, "Produto simples", 45);
    }
    return new Product("Produto-" + UUID.randomUUID(), 456, "Produto simples", 45);
  }
}
