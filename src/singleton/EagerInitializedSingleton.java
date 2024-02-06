package singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
/*
 * Nhược điểm: Có thể đối tượng được tạo nhưng không được sử dụng, reflection
 */