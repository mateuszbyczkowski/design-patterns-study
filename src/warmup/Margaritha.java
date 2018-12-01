package warmup;

public class Margaritha extends Pizza {
    public Margaritha(float i, float i1) {
        setPrice(i);
        setWeight(i1);
    }

    @Override
    public String description() {
        return "Pizza Margarita! Smakuje jak domowa :)";
    }

    @Override
    public boolean isPrzypalona() {
        return false;
    }
}
