package singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    public StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Can not create new instance");
        }
    }
}
