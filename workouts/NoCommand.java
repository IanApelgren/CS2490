
public class NoCommand implements Command {
	public void execute() { }

    @Override
    public void undo() {   }

    @Override
    public String display()
    {
        return null;
    }
}
