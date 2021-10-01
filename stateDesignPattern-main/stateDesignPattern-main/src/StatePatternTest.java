
public class StatePatternTest {
	public static void main(String[] args) {
		LawnMowersContext context = new LawnMowersContext();
		
		StartLawnMowerWork startWork = new StartLawnMowerWork();
		startWork.workStatus(context);
		
		System.out.println(context.getState().toString());
		
		StopLawnMowerWork stopWork = new StopLawnMowerWork();
		stopWork.workStatus(context);
		
		System.out.println(context.getState().toString());
	}
}
