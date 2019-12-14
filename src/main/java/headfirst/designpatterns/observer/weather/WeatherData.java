package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;

/**
 * 追踪来自气象站的数据，并更新布告板
 */
public class WeatherData implements Subject {

    /**
     * 观察者
     */
    private ArrayList<Observer> observers;

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 压力
     */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged() {
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
