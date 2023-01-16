//package headfirst.designpatterns.observer.weatherobservable;
//
//public class HeatIndexDisplay implements Observer, DisplayElements
//{
//    private float heatIndex;
//    private WeatherData weatherData;
//    
//    public HeatIndexDisplay(WeatherData weatherData)
//    {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
//    
//    public void update(float temp, float humidity, float pressure)
//    {
//        heatIndex = findHeatIndex(temp, humidity);
//        display();
//    }
//    
//    public void display() 
//    {
//       System.out.println("heat Index is " + heatIndex);
//    }
//    
//    public float findHeatIndex(float T, float RH)
//    {
//        float hi = 0;
//        if (T < 80) 
//        {
//            hi = T;
//        }
//        else
//        {
//            hi = (float) (-42.379 + 2.04901523 * T + 10.14333127 * RH - .22475541 * T * RH -
//                .00683783 * T * T - .05481717 * RH * RH + .00122874 * T * T * RH + 
//                    .00085282 * T * RH * RH - .00000199 * T * T * RH * RH);
//        }
//        return hi;
//    }
//}
 package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    Observable observable;
    float heatIndex = 0.0f;

    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float t = weatherData.getTemperature();
            float rh = weatherData.getHumidity();
            heatIndex = (float)
                (
                (16.923 + (0.185212 * t)) + 
                (5.37941 * rh) - 
                (0.100254 * t * rh) + 
                (0.00941695 * (t * t)) + 
                (0.00728898 * (rh * rh)) + 
                (0.000345372 * (t * t * rh)) - 
                (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - 
                (0.000038646 * (t * t * t)) + 
                (0.0000291583 * (rh * rh * rh)) +
                (0.00000142721 * (t * t * t * rh)) + 
                (0.000000197483 * (t * rh * rh * rh)) - 
                (0.0000000218429 * (t * t * t * rh * rh)) +
                (0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
            display();
        }
    }

    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
