package fabryka.factoryMethod.carFactory.car;

public class FiatBravoCar implements Car {
    @Override
    public void testCarEngine() {
        System.out.println("Testujemy silnik i emisje spalin w Fiat bravo");
    }
}
