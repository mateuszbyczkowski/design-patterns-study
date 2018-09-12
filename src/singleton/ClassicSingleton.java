package singleton;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {}

    public static ClassicSingleton getUniqueInstance() { //WAZNA METODA
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();

        }
        return uniqueInstance;
    }
}
