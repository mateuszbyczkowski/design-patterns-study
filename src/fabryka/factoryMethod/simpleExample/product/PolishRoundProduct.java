package fabryka.factoryMethod.simpleExample.product;

public class PolishRoundProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Polskie kolo cos");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Polskie kolo cos innego");
    }
}
