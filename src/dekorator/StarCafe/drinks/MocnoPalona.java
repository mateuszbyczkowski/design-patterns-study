package dekorator.StarCafe.drinks;

public class MocnoPalona extends Napoj {

    public MocnoPalona() {
        ustawOpis("Mocno palona");
    }

    @Override
    public float koszt() {
        return 1.99f;
    }
}
