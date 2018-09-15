package fabryka.factoryMethod.simpleExample.product;

public class GermanSquareProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Niemiecki kwadrat cos");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Niemiecki kwadrat cos innego");
    }
}
