package examples.com.numerouno.city;

public class Gym {
	
	public int numWeightMachines;
	public double averageNumHotBabes;
	public String gymSize;
	public String gymName;
	public boolean open = true;

	public Gym(int numWeightMachines, double averageNumHotBabes, String gymSize,
			String gymName) {
		super();
		this.numWeightMachines = numWeightMachines;
		this.averageNumHotBabes = averageNumHotBabes;
		this.gymSize = gymSize;
		this.gymName = gymName;
	}

	public Gym() {

	}
	
	public void openCheck() {
		if(open = true){
			System.out.println("We're open!");
		
		}
		else {
			System.out.println("We're closed :(");
			
		}
	}

	public int getNumberOfMachines() {
		return numWeightMachines;
	}

	public void setNumberOfMachines(int numberOfMachines) {
		this.numWeightMachines = numberOfMachines;
	}

	public double getAverageNumHotBabes() {
		return averageNumHotBabes;
	}

	public void setAverageNumHotBabes(double averageNumHotBabes) {
		this.averageNumHotBabes = averageNumHotBabes;
	}

	public String getGymSize() {
		return gymSize;
	}

	public void setGymSize(String gymSize) {
		this.gymSize = gymSize;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

}
