
public class StopLawnMowerWork implements LawnMowersState{

	@Override
	public void workStatus(LawnMowersContext context) {
		// TODO Auto-generated method stub
		System.out.println("work is in stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop work State";
	}

}
