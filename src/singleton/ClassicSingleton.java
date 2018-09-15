package singleton;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static synchronized ClassicSingleton getUniqueInstance() { //WAZNA METODA
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
            System.out.println("Nowy obiekt utworzony!");

        } else {
            System.out.println("Instancja tego obiektu juz istnieje!");
        }
        return uniqueInstance;
    }
}
