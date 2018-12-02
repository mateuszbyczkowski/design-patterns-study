package dekorator.StarCafe.decorator;

import dekorator.StarCafe.drinks.Napoj;

public class Mleko extends SkladnikDekorator {
    Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", mleko";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 0.20f;
    }
}
