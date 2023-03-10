
public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
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
