package strategia.graStaw;

import strategia.graStaw.klient.DzikaKaczka;
import strategia.graStaw.klient.GumowaKaczka;
import strategia.graStaw.klient.Kaczka;
import strategia.graStaw.klient.KaczkaPlaskonos;

public class Main {
    public static void main(String[] args) {
        Kaczka dzikaKaczka = new DzikaKaczka();
        dzikaKaczka.wyswietl();
        dzikaKaczka.wykonajKwacz();
        dzikaKaczka.wykonajLec();

        Kaczka kaczkaPlaskonos = new KaczkaPlaskonos();
        kaczkaPlaskonos.wyswietl();
        kaczkaPlaskonos.wykonajKwacz();
        kaczkaPlaskonos.wykonajLec();

        Kaczka gumowaKaczka = new GumowaKaczka();
        gumowaKaczka.wyswietl();
        gumowaKaczka.wykonajKwacz();
        gumowaKaczka.wykonajLec();
    }
}
