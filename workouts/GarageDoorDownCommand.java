
public class GarageDoorDownCommand implements Command
{
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    public void execute()
    {
        garageDoor.up();
    }

    @Override
    public void undo()
    {
        garageDoor.down();
        
    }

    @Override
    public String display()
    {
        return this.getClass().getName();
    }
}
