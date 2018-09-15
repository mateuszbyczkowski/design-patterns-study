package obserwator.pogotowie.subject;

import obserwator.pogotowie.observer.Ambulance;

public interface Operator {
    void registerObserver(Ambulance ambulance);
    void removeObserver(Ambulance ambulance);
    void notifyObservers();
    String getStatus();
}