
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}

    @Override
    public void undo()
    {
        hottub.off();
        hottub.bubblesOff();
        hottub.cool();
        
    }

    @Override
    public String display()
    {
        return this.getClass().getName();
    }
}
