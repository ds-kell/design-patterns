package singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
/*
* Khi class BillPughSingleton được tải vào bộ nhớ, class SingletonHelper không được tải.
* Khi gọi phương thức getInstance() của BillPughSingleton lần đầu tiên, nó sẽ gọi SingletonHelper.INSTANCE.
* Lúc này, class SingletonHelper mới được tải vào bộ nhớ và biến INSTANCE được khởi tạo một lần trong quá trình tải.
* Mọi lần gọi getInstance() sau đó sẽ trả về thể hiện đã được khởi tạo từ lần gọi đầu tiên.
*/

/*

 * Nhược điểm: Reflection
 */