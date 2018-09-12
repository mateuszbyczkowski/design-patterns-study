package strategia.graStaw.klient;

import strategia.graStaw.kwakanie.Kwacz;
import strategia.graStaw.latanie.LatamBoMamSkrzydla;

public class KaczkaPlaskonos extends Kaczka {

    public KaczkaPlaskonos() {
        super.ustawKwakanie(new Kwacz());
        super.ustawLatanie(new LatamBoMamSkrzydla());
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem kaczka płaskonos!");
    }
}
