package fabryka.factoryMethod.simpleExample.product;

public class GermanRoundProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Niemieckie koło cos");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Niemieckie koło cos innego");
    }
}
