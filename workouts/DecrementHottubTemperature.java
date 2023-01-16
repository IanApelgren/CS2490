

public class DecrementHottubTemperature implements Command
{
    Hottub hottub;

    public DecrementHottubTemperature(Hottub hottub) {
        this.hottub = hottub;
    }
    @Override
    public void execute()
    {
        hottub.decreaseTemperature();
        
    }
    @Override
    public void undo()
    {
        hottub.increaseTemperature();
        
    }
    @Override
    public String display()
    {
        return this.getClass().getName();
    }
}
