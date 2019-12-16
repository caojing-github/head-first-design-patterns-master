package headfirst.designpatterns.singleton.dcl;

/**
 * "双重检查加锁"实现单例
 * 在java1.4及更早版本，许多jvm对volatile关键字的实现会导致"双重检查加锁"的失效
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
