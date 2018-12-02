package fabryka.factoryMethod.simpleExample.factoryMethods;

import fabryka.factoryMethod.simpleExample.product.Product;

public abstract class AbstractProductProcess {

    public void doAction(String type) {
        Product product = createProduct(type);
        product.doSomething();
        product.doSomethingElse();
    }

    protected abstract Product createProduct(String type);
}