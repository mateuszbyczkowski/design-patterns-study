package fabryka.factoryMethod.carFactory.factoryMethods;

import fabryka.factoryMethod.carFactory.car.Car;
import fabryka.factoryMethod.carFactory.car.VwGolfCar;
import fabryka.factoryMethod.carFactory.car.VwPassatCar;

public class PassatCarProcess extends AbstractCarProcess {
    @Override
    protected Car createCar(String type) {
        Car car = null;
        if (type.equals("passat")) {
            car = new VwPassatCar();
        } else {
            System.out.println("To jest fabryka passata, nie można tu utworzyć nic innego!");
        }
        return car;
    }
}
