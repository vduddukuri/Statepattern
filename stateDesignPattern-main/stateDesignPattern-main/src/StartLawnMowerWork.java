
public class StartLawnMowerWork implements LawnMowersState {

	@Override
	public void workStatus(LawnMowersContext context) {
		// TODO Auto-generated method stub
		System.out.println("work is in start state");
		context.setState(this);
	}
	
	public String toString() {
		return "Start Work State";
	}
}
