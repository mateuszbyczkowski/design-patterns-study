package dekorator.StarCafe.drinks;

public abstract class Napoj {
    private String opis = "Napoj nieznany";
    private float koszt;

    public String pobierzOpis() {
        return this.opis;
    }

    public void ustawOpis(String opis) {
       this.opis = opis;
    }

    public abstract float koszt();
}
