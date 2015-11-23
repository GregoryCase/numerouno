package examples.com.numerouno.city;

public class IndoorGym extends Gym {

	private int numTvs;
	private int numTreadmills;

	public int getNumTvs() {
		return numTvs;
	}

	public void setNumTvs(int numTvs) {
		this.numTvs = numTvs;
	}

	public int getNumTreadmills() {
		return numTreadmills;
	}

	public void setNumTreadmills(int numTreadmills) {
		this.numTreadmills = numTreadmills;
	}

	public IndoorGym() {
		super();
	}

	public IndoorGym(int numWeightMachines, double averageNumHotBabes,
			String gymSize, String gymName, int numTvs, int numTreadmills) {
		super(numWeightMachines, averageNumHotBabes, gymSize, gymName);
		this.numTvs = numTvs;
		this.numTreadmills = numTreadmills;
	}
	
	@Override
	public String toString() {
		return "At " + gymName + ", we have over " + numWeightMachines + 
				" machines to workout on. If cardio is more of your thing, choose from over " + numTreadmills + 
				" carido machines to workout on while watching one of our " + numTvs + " TVs or staring at one of the " +
				averageNumHotBabes + " babes in the gym at any one given time. " + gymName + " is a " + gymSize + " sized gym.";

}

}