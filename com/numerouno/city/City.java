package examples.com.numerouno.city;

public class City {

	private Gym gym;
	private Airport airport;
	private Seaport seaport;
	private Mall mall;
	private GovernmentBuildings GovernmentBuildings;
	private String CityName;

	public City(Gym gym, Airport airport, String Name) {
		this.gym = gym;
		this.airport = airport;
		this.CityName = Name;
	}

	@Override
	public String toString() {
		return "Welcome to " + CityName + "!";
	}



	



	

}
