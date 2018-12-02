package fabryka.simpleFactory;

public class SimpleFactory {
    public static Product createProduct(String type) {
        Product product = null;
        if (type.equals("circle")) {
            product = new Circle();
        } else if (type.equals("square")) {
            product = new Square();
        }
        return product;
    }
}
