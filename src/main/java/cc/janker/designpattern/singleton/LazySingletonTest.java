package cc.janker.designpattern.singleton;

public class LazySingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(lazySingleton);
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(lazySingleton);
            }
        });
        t2.start();

    }
}
class LazySingleton{
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
