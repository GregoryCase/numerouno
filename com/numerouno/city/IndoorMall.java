package examples.com.numerouno.city;

public class IndoorMall extends Mall {
	
	private int elevatorCount;

	public int getElevatorCount() {
		return elevatorCount;
	}

	public void setElevatorCount(int elevatorCount) {
		this.elevatorCount = elevatorCount;
	}
	
	public IndoorMall() {
		super();
	}

	public IndoorMall(int shopCount, boolean eatery, String name,
			int elevatorCount) {
		super(shopCount, eatery, name);
		this.elevatorCount = elevatorCount;
	}
	
	@Override
	public String toString() {
		return name + " is an indoor mall featuring " + shopCount + " shops and " 
				+ elevatorCount + " elevators for your consuming & convenience pleasure! ";
	}

}
