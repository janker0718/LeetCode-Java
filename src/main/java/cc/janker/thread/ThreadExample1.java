package cc.janker.thread;

public class ThreadExample1 {
    public static volatile int i = 1;

    public static void main(String[] args) {
        final Object object = new Object();
        Thread t1 = new Thread(() -> {
            while (i < 100){
                synchronized (object){
                    if (i % 2 == 0){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(i++);
                    }
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while (i < 100){
                synchronized (object){
                    if (i % 2 == 1){
                        object.notify();
                    }else {
                        System.out.println(i++);
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
