package obserwator.stacjaMeteo.observer;

import obserwator.stacjaMeteo.subject.Podmiot;

import java.util.ArrayList;
import java.util.List;

public class StatystykaPogodowa implements WyswietlElement, Obserwator {
    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wilgotnosci = new ArrayList<>();
    private List<Float> cisnienia = new ArrayList<>();
    private Podmiot danePogodowe;

    public StatystykaPogodowa(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatury.add(temperatura);
        this.wilgotnosci.add(temperatura);
        this.temperatury.add(temperatura);

    }

    @Override
    public void wyswietl() {

    }
}
