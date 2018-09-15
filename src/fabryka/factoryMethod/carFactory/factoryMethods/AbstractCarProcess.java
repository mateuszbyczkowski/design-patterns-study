package fabryka.factoryMethod.carFactory.factoryMethods;

import fabryka.factoryMethod.carFactory.car.Car;

public abstract class AbstractCarProcess {

    public Car doAction(String type) {
        Car car = createCar(type);
        car.testCarEngine();
        return car;
    }

    protected abstract Car createCar(String type);
}