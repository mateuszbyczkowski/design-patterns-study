package obserwator.pogotowie;

import obserwator.pogotowie.observer.FirstAmbulance;
import obserwator.pogotowie.observer.SecondAmbulance;
import obserwator.pogotowie.observer.ThirdAmbulance;
import obserwator.pogotowie.subject.OperatorAdam;

public class Main {
    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();
        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance = new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance((operatorAdam));

        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Car accident");
        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Faint");
        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Broken bone");
        System.out.println("---------------------------------------------");
    }
}
