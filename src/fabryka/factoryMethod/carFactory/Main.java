package fabryka.factoryMethod.carFactory;

import fabryka.factoryMethod.carFactory.factoryMethods.AbstractCarProcess;
import fabryka.factoryMethod.carFactory.factoryMethods.FiatCarProcess;
import fabryka.factoryMethod.carFactory.factoryMethods.VolkswagenCarProcess;
import fabryka.factoryMethod.carFactory.car.Car;

public class Main {
    public static void main(String[] args) {
        AbstractCarProcess factory;

        factory = new FiatCarProcess();
        Car panda = factory.doAction("panda");//wyprodukujemy obiekt panda w fabryce Fiata

        factory = new VolkswagenCarProcess();
        Car passat = factory.doAction("passat");//wyprodukujemy obiekt passat w fabryce Volkswagena
    }
}

