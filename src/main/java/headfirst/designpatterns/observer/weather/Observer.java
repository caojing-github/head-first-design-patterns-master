package headfirst.designpatterns.observer.weather;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 当主题状态改变时它被调用
     */
    void update(float temp, float humidity, float pressure);
}
