
public class Hottub {
    public final int maxTemp = 110;
    public final int minTemp = 80;
	boolean on;
	int temperature;

	public Hottub() {
	    temperature = 105;
	}

	public void on() {
		on = true;
		
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		checkTemp();
	}

	public void increaseTemperature() {
	    temperature = temperature + 1;
	    checkTemp();
	}
	
	public void decreaseTemperature() {
	    temperature = temperature - 1;
	    checkTemp();
	}
	
	public int getTemp()
	{
	    return temperature;
	}
	
	public void heat() {
		temperature = 105;
		System.out.println("Hottub is heating to a steaming 105 degrees");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Hottub is cooling to 98 degrees");
	}
	
	public void checkTemp()
	{
	    if (on) 
	    {
	        if (temperature < minTemp)
	        {
	            temperature = minTemp;
	            System.out.println("temp was under min brought up to " + temperature);
	        }
	        else if (temperature > maxTemp)
	        {
	            temperature = maxTemp;
	            System.out.println("temp was over max brought down to " + temperature);
	        }
	        else
	        {
	            System.out.println("temp was set to " + temperature);
	        }
	    }
        
	    
	}

}
