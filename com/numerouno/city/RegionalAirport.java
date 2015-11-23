package examples.com.numerouno.city;


public class RegionalAirport extends Airport {

	private int numOfRegionsServed;

	public int getNumOfRegionsServed() {
		return numOfRegionsServed;
	}

	public void setNumOfRegionsServed(int numOfRegionsServed) {
		this.numOfRegionsServed = numOfRegionsServed;
	}

	public RegionalAirport(int dailyFlights, int totalConcourses,
			String mostFlights, String airportName, int numOfRegionsServed) {
		super(dailyFlights, totalConcourses, mostFlights, airportName);
		this.numOfRegionsServed = numOfRegionsServed;
	}

	public RegionalAirport() {
		super();
	}

	@Override
	public String toString() {
		return "Here at " + airportName
				+ " Airport, we send and receive roughly " + dailyFlights
				+ " flights per day throughout our " + totalConcourses
				+ " concourses. Our largest flight service provider is "
				+ mostFlights + ". Additionally, we provide service to "
				+ numOfRegionsServed
				+ " of the closest regional airports in the area.";
	}

	public void turnOnRunwayLights() {
		System.out.println("Lights for 2 runways at " + airportName
				+ " airport turned on.");

	}

}
