package strategia.graStaw.klient;

import strategia.graStaw.kwakanie.Piszcz;
import strategia.graStaw.latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka() {
        super.ustawKwakanie(new Piszcz());
        super.ustawLatanie(new NieLatam());
    }
    @Override
    public void wyswietl() {
        System.out.println("Jestem gumowa kaczka!");
    }


}
