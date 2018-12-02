package obserwator.pogotowie.observer;

import obserwator.pogotowie.subject.Operator;

public class FirstAmbulance implements Ambulance {
    private Operator operator;

    public FirstAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    public void unregister() {
        if (operator != null) {
            operator.removeObserver(this);
        }
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(FirstAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
