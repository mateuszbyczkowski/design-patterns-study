package warmup;

public class Napoli extends Pizza {
    public Napoli() {
        setPrice(20.0f);
        setWeight(10.0f);
    }

    @Override
    public String description() {
        return "Pizza NAPOLI! Smakuje jak domowa :)";
    }

    @Override
    public boolean isPrzypalona() {
        return false;
    }
}
