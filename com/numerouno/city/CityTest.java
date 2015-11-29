package examples.com.numerouno.city;

public class CityTest {

	public static void main(String[] args) {

		
		
		Airport PeachtreeDekalb = new RegionalAirport(550, 2, "Delta", "Peachtree-Dekalb", 73);
		Gym FlexIt = new IndoorGym(40, 2.4, "large", "Flex It", 50, 30);
		City Atlanta = new City(FlexIt, PeachtreeDekalb, "Atlanta");
		Gym PumpIt = new OutdoorGym(22, 11.5, "medium", "Pump It", 78, 53);
		Airport HartsfieldJackson = new InternationalAirport(550, 2, "Delta", "Hartsfield-Jackson", 
				"Europe, Africa, Americas, and East Asia");
		Mall NorthpointMall = new IndoorMall(300, true, "North Point Mall", 4);
		Mall WylandPines = new OutdoorMall(72, false, "Wyland Pines Shopping Center", 14);
		Courthouse JamesWilkins = new Courthouse(32, "James P. Wilkins", 2300000, 4, 15, 17);
		Jail BrentonMiller = new Jail(60, "Brenton-Miller", 700000, 200, 60);
		
		
		
		System.out.println(Atlanta.toString());
		System.out.println(FlexIt.toString());
		FlexIt.openCheck();
		System.out.println(PumpIt.toString());
		PumpIt.openCheck();
		HartsfieldJackson.turnOnRunwayLights();
		System.out.println(HartsfieldJackson.toString());
		PeachtreeDekalb.turnOnRunwayLights();
		System.out.println(PeachtreeDekalb.toString());
		System.out.println(NorthpointMall.toString());
		NorthpointMall.eaterycheck();
		System.out.println(WylandPines.toString());
		WylandPines.eaterycheck();
		System.out.println(JamesWilkins.toString());
		System.out.println(BrentonMiller.toString());

	}

}
