package examples.com.numerouno.city;

public class Jail extends GovernmentBuildings {

private int cellCount;
private int guardCount;

public int getCellCount() {
	return cellCount;
}
public void setCellCount(int cellCount) {
	this.cellCount = cellCount;
}
public int getGuardCount() {
	return guardCount;
}
public void setGuardCount(int guardCount) {
	this.guardCount = guardCount;
}

public Jail() {
	super();
}
public Jail(int employeeCount, String buildingName, long constructioncosts, int cellCount, int guardCount) {
	super(employeeCount, buildingName, constructioncosts);
	this.cellCount = cellCount;
	this.guardCount = guardCount;
}

@Override
public String toString() {
	return "This jail is named " + buildingName + " and currently employs " + guardCount + " guards. There are " 
+ cellCount + " total cells at " +buildingName + " and the construction costs of this jail totaled " + constructioncosts + " dollars of taxpayer money. ";
}

}
