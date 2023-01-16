
public class Manager extends Worker
{

    public Manager(String description, String wakeUpTime,
        double workHours)
    {
        super(description, wakeUpTime, workHours);
    }

    @Override
    public void relax()
    {
        System.out.println("I havent done any work guess I can relax now");
        
    }

    @Override
    public void work()
    {
        System.out.println("what is this work? Intern could you do this?");
        
    }
    

}
