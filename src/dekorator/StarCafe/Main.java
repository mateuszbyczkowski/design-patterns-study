package dekorator.StarCafe;

import dekorator.StarCafe.decorator.Mleko;
import dekorator.StarCafe.drinks.MocnoPalona;
import dekorator.StarCafe.drinks.Napoj;

public class Main {
    public static void main(String[] args) {
        Napoj mocnoPalona = new MocnoPalona();
        System.out.println(mocnoPalona.pobierzOpis() + " " + mocnoPalona.koszt() + " zł");

        mocnoPalona = new Mleko(mocnoPalona);

        System.out.println(mocnoPalona.pobierzOpis() + " " + mocnoPalona.koszt() + " zł");

    }
}
