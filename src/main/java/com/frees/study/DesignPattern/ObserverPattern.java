package com.frees.study.DesignPattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverPattern {

    public static void main(String[] args) {


        WeatherData weatherData = new WeatherData();

        CurrentCoditionDisplay currentCoditionDisplay = new CurrentCoditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements("1","2","3");

    }

}

class WeatherData extends Observable {

    private String temperature;
    private String humidity;
    private String pressure;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(String temperature,String pressure,String humidity){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        meansurementsChanged();
    }

    public void meansurementsChanged(){
        setChanged();
        notifyObservers();
    }
}

class CurrentCoditionDisplay implements Observer{

    private Observable observable;
    public CurrentCoditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) o;
            String humidity = weatherData.getHumidity();
            String pressure = weatherData.getPressure();
            String temperature = weatherData.getTemperature();
            System.out.println(humidity + "," + pressure + "," + temperature);
        }
    }
}

class StatisticsDisplay implements Observer{

    private Observable observable;
    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(1);
        if (o instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) o;
            String humidity = weatherData.getHumidity();
            String pressure = weatherData.getPressure();
            String temperature = weatherData.getTemperature();
            System.out.println(humidity + "," + pressure + "," + temperature);
        }
    }
}
