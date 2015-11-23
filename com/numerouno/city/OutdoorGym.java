package examples.com.numerouno.city;

public class OutdoorGym extends Gym {

	private int averageOutsideTemp;
	private int distanceToOcean;

	public int getAverageOutsideTemp() {
		return averageOutsideTemp;
	}

	public void setAverageOutsideTemp(int averageOutsideTemp) {
		this.averageOutsideTemp = averageOutsideTemp;
	}

	public int getDistanceToOcean() {
		return distanceToOcean;
	}

	public void setDistanceToOcean(int distanceToOcean) {
		this.distanceToOcean = distanceToOcean;
	}

	public OutdoorGym() {
		super();
	}

	public OutdoorGym(int numWeightMachines, double averageNumHotBabes,
			String gymSize, String gymName, int averageOutsideTemp, int distanceToOcean) {
		super(numWeightMachines, averageNumHotBabes, gymSize, gymName);
		this.averageOutsideTemp = averageOutsideTemp;
		this.distanceToOcean = distanceToOcean;
	}

	@Override
	public String toString() {
		return "At " + gymName + ", we have over " + numWeightMachines + 
				" machines to workout on. The average temperature outside is usually a perfect " + 
				averageOutsideTemp + " degrees and we are only " + distanceToOcean + " ft. from the ocean. " + 
				gymName + " is a " + gymSize + " sized gym and there are, on the average, " + 
				averageNumHotBabes + " hot babes to check out on any given day.";
	}
	
	
	
	

}
