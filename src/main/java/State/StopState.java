package State;

public class StopState implements State{
	
	public void doAction(Context context)
	{
		System.out.println("Player is in stopState");
		context.setState(this);
	}
	
	public String toString()
	{
		return "Stop State";
	}
	
}
