
public class Client
{

    public static void main(String[] args)
    {
        CovidSimulation covidSim = new CovidSimulation();
        
        covidSim.signalTakeMaskOff();
        covidSim.signalPutMaskOn();
        covidSim.signalGoOutside();
        covidSim.signalGoOutside();
        System.out.println(covidSim);
        
        covidSim.signalGoInside();
        covidSim.signalGoInside();
        covidSim.signalTakeMaskOff();
        covidSim.signalGoOutside();
        System.out.println(covidSim);
        
        covidSim.signalGoOutside();
        covidSim.signalPutMaskOn();
        covidSim.signalGoOutside();
        System.out.println(covidSim);
        
        covidSim.signalVaccinated();
        System.out.println(covidSim);
        

    }

}
