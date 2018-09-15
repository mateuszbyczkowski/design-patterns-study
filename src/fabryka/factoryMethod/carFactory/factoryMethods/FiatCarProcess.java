package fabryka.factoryMethod.carFactory.factoryMethods;

import fabryka.factoryMethod.carFactory.car.FiatBravoCar;
import fabryka.factoryMethod.carFactory.car.FiatPandaCar;
import fabryka.factoryMethod.carFactory.car.Car;

public class FiatCarProcess extends AbstractCarProcess {
    @Override
    protected Car createCar(String type) {
        Car car = null;
        if (type.equals("panda")) {
            car = new FiatPandaCar();
        } else if (type.equals("bravo")) {
            car = new FiatBravoCar();
        }
        return car;
    }
}