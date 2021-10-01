
public class LawnMowersContext {
	private LawnMowersState state;
	
	
	public void setState(LawnMowersState state) {
		this.state = state;
	}
	
	public LawnMowersState getState() {
		return state;
	}

}
