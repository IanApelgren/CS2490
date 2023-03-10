
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
    @Override
    public void undo()
    {
        ceilingFan.off();
        
    }
    @Override
    public String display()
    {
        return this.getClass().getName();
    }
}
