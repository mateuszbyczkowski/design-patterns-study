package obserwator.stacjaMeteo.subject;

import obserwator.stacjaMeteo.observer.Obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        int i = obserwatorzy.indexOf(obserwator);
        if (i >= 0) {
            obserwatorzy.remove(i);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        for (Object obs : obserwatorzy) {
            Obserwator obserwator = (Obserwator) obs;
            obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void odczytyZmiana() {
        powiadomObserwatorow();
    }

    //testowe ustawianie odczytow (domyslnie chcielibysmy je pobierac ze stacji meteo)
    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
}