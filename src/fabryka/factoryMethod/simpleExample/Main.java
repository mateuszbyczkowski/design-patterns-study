package fabryka.factoryMethod.simpleExample;

import fabryka.factoryMethod.simpleExample.factoryMethods.AbstractProductProcess;
import fabryka.factoryMethod.simpleExample.factoryMethods.GermanProductProcess;
import fabryka.factoryMethod.simpleExample.factoryMethods.PolishProductProcess;

public class Main {
    public static void main(String[] args) {
        AbstractProductProcess factory;

        factory = new PolishProductProcess();
        factory.doAction("square"); //zostaną wykonane operacje na utworzonym obiekcie PolishRoundProduct

        factory = new GermanProductProcess();
        factory.doAction("round"); //zostaną wykonane operacje na utworzonym obiekcie GermanSquareProduct
    }
}
