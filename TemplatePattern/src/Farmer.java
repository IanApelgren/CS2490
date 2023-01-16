
public class Farmer extends Worker
{

    public Farmer(String description, String wakeUpTime,
        double workHours)
    {
        super(description, wakeUpTime, workHours);
    }
    

    @Override
    public void work()
    {
        System.out.println("Time for another long day on the farms");
        
    }

}
