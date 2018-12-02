package fabryka.simpleFactory;

public class Circle implements Product{
    @Override
    public void doSomething() {
        System.out.println("Cos kolko");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Cos kolko jeszcze");
    }
}
