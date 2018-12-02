package obserwator.stacjaMeteo.observer;

import obserwator.stacjaMeteo.subject.Podmiot;

import java.util.ArrayList;
import java.util.List;

public class StatystykaPogodowa implements WyswietlElement, Obserwator {
    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wilgotnosci = new ArrayList<>();
    private List<Float> cisnienia = new ArrayList<>();

    public StatystykaPogodowa(Podmiot danePogodowe) {
        danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatury.add(temperatura);
        this.wilgotnosci.add(temperatura);
        this.temperatury.add(temperatura);
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.printf("\nOto jest statystyka! dla " + temperatury.size() + " ostatnich dni"
                + "temperatura " + avgTemperature()
                + " cisnienie " + avgPressure()
                + " wilgotnosc " + avgHumidity() + "\n");
    }

    private float avgTemperature() {
        float avgSum = 0;
        for (float temperature : temperatury) {
            avgSum += temperature;
        }
        return avgSum / temperatury.size();
    }

    private float avgHumidity() {
        float avgSum = 0;
        for (float humidity : wilgotnosci) {
            avgSum += humidity;
        }
        return avgSum / wilgotnosci.size();
    }

    private float avgPressure() {
        float avgSum = 0;
        for (float cisn : cisnienia) {
            avgSum += cisn;
        }
        return avgSum / cisnienia.size();
    }
}
