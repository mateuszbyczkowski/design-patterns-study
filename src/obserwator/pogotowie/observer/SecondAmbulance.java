package obserwator.pogotowie.observer;

import obserwator.pogotowie.subject.Operator;

public class SecondAmbulance implements Ambulance {
    private Operator operator;

    public SecondAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }
    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(SecondAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}