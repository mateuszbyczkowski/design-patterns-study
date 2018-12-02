package fabryka.factoryMethod.carFactory.car;

public class FiatPandaCar implements Car {
    @Override
    public void testCarEngine() {
        System.out.println("Testujemy silnik i emisje spalin w Fiat panda");
    }
}
