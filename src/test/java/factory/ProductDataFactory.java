package factory;

import serverest.Product;

import java.util.UUID;

public class ProductDataFactory {
  public static Product createSampleProduct() {
    return new Product("Produto-" + UUID.randomUUID(), 456, "Produto simples", 45);
  }
}
