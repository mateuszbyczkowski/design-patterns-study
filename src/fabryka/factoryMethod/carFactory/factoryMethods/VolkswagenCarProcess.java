package fabryka.factoryMethod.carFactory.factoryMethods;

import fabryka.factoryMethod.carFactory.car.VwPassatCar;
import fabryka.factoryMethod.carFactory.car.VwGolfCar;
import fabryka.factoryMethod.carFactory.car.Car;

public class VolkswagenCarProcess extends AbstractCarProcess {
    @Override
    protected Car createCar(String type) {
        Car car = null;
        if (type.equals("passat")) {
            car = new VwPassatCar();
        } else if (type.equals("golf")) {
            car = new VwGolfCar();
        }
        return car;
    }
}