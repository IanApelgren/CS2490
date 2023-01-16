

public class IncrementHottubTemperature implements Command 
{

    Hottub hottub;

    public IncrementHottubTemperature(Hottub hottub) {
        this.hottub = hottub;
    }
    @Override
    public void execute()
    {
        hottub.increaseTemperature();
        
    }
    @Override
    public void undo()
    {
        hottub.decreaseTemperature();
        
    }
    @Override
    public String display()
    {
        return this.getClass().getName();
    }

}
