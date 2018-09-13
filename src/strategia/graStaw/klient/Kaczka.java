package strategia.graStaw.klient;

import strategia.graStaw.kwakanie.Kwakanie;
import strategia.graStaw.latanie.Latanie;

public abstract class Kaczka {

    private Kwakanie kwakanie;
    private Latanie latanie;

    public void lec() {
        System.out.println("LATAAM!");
    }

    public void plywaj() {
        System.out.println("Kaczka plywa");
    }

    public void wykonajKwacz() {
        kwakanie.kwacz();
    }

    public void wykonajLec() {
        latanie.lec();
    }

    public void ustawLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    public void ustawKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public abstract void  wyswietl();
}
