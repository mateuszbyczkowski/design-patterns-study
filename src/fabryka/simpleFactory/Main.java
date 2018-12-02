package fabryka.simpleFactory;

public class Main {
    public static void main(String[] args) {

        ProductProcess productProcess = new ProductProcess();

        productProcess.doAction("square");
        productProcess.doAction("circle");
    }
}
