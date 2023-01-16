 


public abstract class Worker
{
    protected String description;
    protected String wakeUpTime;
    protected double workHours;
    
    
    public Worker(String description, String wakeUpTime,
        double sleepHours)
    {
        this.description = description;
        this.wakeUpTime = wakeUpTime;
        this.workHours = workHours;
    }

    public final void dailyRoutine()
    {
        System.out.println(description);
        getUp();
        goToWork();
        work();
        returnHome();
        relax();
        sleep();
        
    }
    
    public final void getUp()
    {
        System.out.println("It's "+ wakeUpTime +" already? Better get ready for school.");
    }
    
    public void goToWork()
    {
        System.out.println("I should probably go to work now.");
    }
    
    public abstract void work();
    
    public void returnHome()
    {
        System.out.println("Done with work better head home.");
    }
    
    
    public void relax()
    {
        System.out.println("ive been working for " + workHours + " hours, guess I can relax now.");
    }
    
    final public void sleep()
    {
        System.out.println("guess I can finaly get some sleep");
    }
}
