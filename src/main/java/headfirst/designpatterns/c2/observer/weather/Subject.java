package headfirst.designpatterns.c2.observer.weather;

/**
 * 主题
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer o);

    /**
     * 观察者取消注册
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
