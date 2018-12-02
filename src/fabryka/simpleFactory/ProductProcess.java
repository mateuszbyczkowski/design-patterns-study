package fabryka.simpleFactory;

public class ProductProcess {
    public void doAction(String type) {
        Product product = SimpleFactory.createProduct(type);
        product.doSomething();
        product.doSomethingElse();
    }
}
