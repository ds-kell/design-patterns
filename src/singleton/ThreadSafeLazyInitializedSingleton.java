package singleton;

public class ThreadSafeLazyInitializedSingleton {

    private static volatile ThreadSafeLazyInitializedSingleton INSTANCE;

    private ThreadSafeLazyInitializedSingleton() {
    }

    public static synchronized ThreadSafeLazyInitializedSingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitializedSingleton();
        }
        return INSTANCE;
    }
}
