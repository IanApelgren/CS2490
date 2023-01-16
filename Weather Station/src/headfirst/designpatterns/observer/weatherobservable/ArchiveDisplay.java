package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
/**
 *  
 * @author Ian Apelgren
 *
 */

public class ArchiveDisplay implements Observer, DisplayElement
{
    Observable observable;
    public ArrayList<Float> temps;
    
    public ArchiveDisplay(Observable observable)
    {
        observable.addObserver(this);
        temps = new ArrayList<Float>();
        
        
    }
    
    @Override
    public void update(Observable observable, Object arg)
    {
        if (observable instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            Float tempf = new Float(temp);
            temps.add(tempf);
            
            
        }
    }
    
    @Override
    public void display()
    {
        
        System.out.println("Temperatures");
        for(int i = 0; i < temps.size(); i++)
        {
            System.out.println(temps.get(i));
        }
    }

}
