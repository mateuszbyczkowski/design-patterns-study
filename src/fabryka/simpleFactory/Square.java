package fabryka.simpleFactory;

public class Square implements Product {
    @Override
    public void doSomething() {
        System.out.println("Cos kwadrat");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Cos kwadrat jeszcze");
    }
}
