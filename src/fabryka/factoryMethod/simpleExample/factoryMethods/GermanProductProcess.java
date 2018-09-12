package fabryka.factoryMethod.simpleExample.factoryMethods;

import fabryka.factoryMethod.simpleExample.product.GermanRoundProduct;
import fabryka.factoryMethod.simpleExample.product.GermanSquareProduct;
import fabryka.factoryMethod.simpleExample.product.Product;

public class GermanProductProcess extends AbstractProductProcess {
    @Override
    protected Product createProduct(String type) {
        Product product = null;
        if (type.equals("round")) {
            product = new GermanRoundProduct();
        } else if (type.equals("square")) {
            product = new GermanSquareProduct();
        }
        return product;
    }
}