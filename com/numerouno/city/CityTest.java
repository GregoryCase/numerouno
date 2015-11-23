package examples.com.numerouno.city;

public class CityTest {

	public static void main(String[] args) {

		
		
		Airport PeachtreeDekalb = new RegionalAirport(550, 2, "Delta", "Peachtree-Dekalb", 73);
		Gym FlexIt = new IndoorGym(40, 2.4, "large", "Flex It", 50, 30);
		City Atlanta = new City(FlexIt, PeachtreeDekalb, "Atlanta");
		Gym PumpIt = new OutdoorGym(22, 11.5, "medium", "Pump It", 78, 53);
		Airport HartsfieldJackson = new InternationalAirport(550, 2, "Delta", "Hartsfield-Jackson", 
				"Europe, Africa, Americas, and East Asia");
		
		
		
		System.out.println(Atlanta.toString());
		System.out.println(FlexIt.toString());
		System.out.println(PumpIt.toString());
		HartsfieldJackson.turnOnRunwayLights();
		System.out.println(HartsfieldJackson.toString());
		PeachtreeDekalb.turnOnRunwayLights();
		System.out.println(PeachtreeDekalb.toString());
		


	}

}
