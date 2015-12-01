package classic;// NOTE: This is not thread safe!

public class Singleton {
    private static Singleton uniqueInstance;


    Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}