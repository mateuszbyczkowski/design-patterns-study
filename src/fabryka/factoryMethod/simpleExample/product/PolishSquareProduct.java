package fabryka.factoryMethod.simpleExample.product;

public class PolishSquareProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Polski kwadrat cos");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Polski kwadrat cos innego");
    }
}
