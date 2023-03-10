
public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

    @Override
    public void undo()
    {
        light.off();
        
    }

    @Override
    public String display()
    {
        return this.getClass().getName();
    }
}
