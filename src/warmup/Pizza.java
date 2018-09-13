package warmup;

public abstract class Pizza implements Dish {
    private Float price;
    private Float weight;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public abstract boolean isPrzypalona();
}
