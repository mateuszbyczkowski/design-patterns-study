package obserwator.stacjaMeteo.observer;

import obserwator.stacjaMeteo.subject.Podmiot;

public class WarunkiBiezaceWyswietl implements WyswietlElement, Obserwator {
    private float temperatura;
    private float wilgotnosc;

    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki biezace " + temperatura +
                " stopni C oraz " + wilgotnosc + "% wilgotnosc");

    }
}
