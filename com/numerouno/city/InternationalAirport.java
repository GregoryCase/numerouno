package examples.com.numerouno.city;

public class InternationalAirport extends Airport {
	
	private String continentsServed;

	
	public String getContinentsServed() {
		return continentsServed;
	}


	public void setContinentsServed(String continentsServed) {
		this.continentsServed = continentsServed;
	}
	
	
	public InternationalAirport () {
		super();
	}
	
	
	
public InternationalAirport(int dailyFlights, int totalConcourses,
			String mostFlights, String airportName, String continentsServed) {
		super(dailyFlights, totalConcourses, mostFlights, airportName);
		this.continentsServed = continentsServed;
		
	}


@Override
	public String toString() {
		return "Here at " + airportName
				+ " Airport, we send and receive roughly " + dailyFlights
				+ " flights per day throughout our " + totalConcourses
				+ " concourses. Our largest flight service provider is "
				+ mostFlights + ". Internationally, we offer service to these wonderful continents: "
						+ continentsServed + ".";
	}
	
	public void turnOnRunwayLights() {
		System.out.println("Lights for 5 runways at " + airportName + " airport turned on.");
	
		
	}

	
	}

