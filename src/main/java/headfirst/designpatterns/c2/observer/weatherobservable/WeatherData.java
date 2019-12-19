package headfirst.designpatterns.c2.observer.weatherobservable;

import java.util.Observable;

/**
 * 使用java内置的观察者模式实现"追踪来自气象站的数据，并更新布告板"
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        // 标记状态已经改变
        setChanged();
        // 通知观察者，另一个方法notifyObservers(Object arg)传送任何数据给每一个观察者
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
