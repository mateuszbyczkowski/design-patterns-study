package warmup;

public class Margaritha extends Pizza {
    public Margaritha() {
        setPrice(20.0f);
        setWeight(10.0f);
    }

    @Override
    public String description() {
        return "Pizza Margarita! Smakuje jak domowa :)";
    }
}
