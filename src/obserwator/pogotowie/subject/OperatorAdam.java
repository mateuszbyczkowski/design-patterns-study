package obserwator.pogotowie.subject;

import obserwator.pogotowie.observer.Ambulance;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements Operator {
    private List<Ambulance> ambulances = new ArrayList<>();
    private String status = "";

    @Override
    public void registerObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        ambulances.forEach(Ambulance::update);

//        if you don't know JAVA 8
//        for (Ambulance ambulance : ambulances) {
//            ambulance.update();
//        }
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}