package fabryka.factoryMethod.simpleExample.factoryMethods;

import fabryka.factoryMethod.simpleExample.product.PolishRoundProduct;
import fabryka.factoryMethod.simpleExample.product.PolishSquareProduct;
import fabryka.factoryMethod.simpleExample.product.Product;

public class PolishProductProcess extends AbstractProductProcess {
    @Override
    protected Product createProduct(String type) {
        Product product = null;
        if (type.equals("round")) {
            product = new PolishRoundProduct();
        } else if (type.equals("square")) {
            product = new PolishSquareProduct();
        }
        return product;
    }
}