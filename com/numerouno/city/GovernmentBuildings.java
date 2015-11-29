package examples.com.numerouno.city;

public class GovernmentBuildings {
	
	public int employeeCount;
	public String buildingName;
	public long constructioncosts;
	public GovernmentBuildings(int employeeCount, String buildingName,
			long constructioncosts) {
		super();
		this.employeeCount = employeeCount;
		this.buildingName = buildingName;
		this.constructioncosts = constructioncosts;
	}
	
	public GovernmentBuildings() {
		
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public long getConstructioncosts() {
		return constructioncosts;
	}

	public void setConstructioncosts(long constructioncosts) {
		this.constructioncosts = constructioncosts;
	}
	
	

}
