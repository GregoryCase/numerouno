package examples.com.numerouno.city;

public class Courthouse extends GovernmentBuildings {

	private int courtroomCount;
	private int judgeCount;
	private int lawyerCount;
	
	public int getCourtroomCount() {
		return courtroomCount;
	}
	public void setCourtroomCount(int courtroomCount) {
		this.courtroomCount = courtroomCount;
	}
	public int getJudgeCount() {
		return judgeCount;
	}
	public void setJudgeCount(int judgeCount) {
		this.judgeCount = judgeCount;
	}
	public int getLawyerCount() {
		return lawyerCount;
	}
	public void setLawyerCount(int lawyerCount) {
		this.lawyerCount = lawyerCount;
	}
	
	public Courthouse() {
		super();
	}
	public Courthouse(int employeeCount, String buildingName,
			long constructioncosts, int courtroomCount, int judgeCount, int lawyerCount) {
		super(employeeCount, buildingName, constructioncosts);
		this.courtroomCount = courtroomCount;
		this.judgeCount = judgeCount;
		this.lawyerCount = lawyerCount;
	}
	
	@Override
	public String toString() {
		return "This courthouse is named " + buildingName + " and currently employs " + employeeCount + " state employees. " 
	+ judgeCount + " of these employees are judges and " + lawyerCount + " of these employees are lawyers. The " + buildingName 
	+ " Courthouse currently has " + courtroomCount + " courtrooms and cost taxpayers roughly " 
	+ constructioncosts + " dollars to build. ";
	}
	
	
	
}
