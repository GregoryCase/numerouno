package examples.com.numerouno.city;

public class Airport {

	public int dailyFlights;
	public int totalConcourses;
	public String mostFlights;
	public String airportName;

	public Airport(int dailyFlights, int totalConcourses, String mostFlights,
			String airportName) {
		super();
		this.dailyFlights = dailyFlights;
		this.totalConcourses = totalConcourses;
		this.mostFlights = mostFlights;
		this.airportName = airportName;

	}

	public Airport() {

	}

	public int getDailyFlights() {
		return dailyFlights;
	}

	public void setDailyFlights(int dailyFlights) {
		this.dailyFlights = dailyFlights;
	}

	public int getTotalConcourses() {
		return totalConcourses;
	}

	public void setTotalConcourses(int totalConcourses) {
		this.totalConcourses = totalConcourses;
	}

	public String getMostFlightsCompany() {
		return mostFlights;
	}

	public void setMostFlightsCompany(String mostFlights) {
		this.mostFlights = mostFlights;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	

	public void turnOnRunwayLights() {
	}

}
