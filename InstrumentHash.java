package examples;

import java.util.HashMap;

public class InstrumentHash {
	public static void main(String[] args) {
		
		HashMap<String, Integer> instrumentPrices = new HashMap<String, Integer>();
		
		instrumentPrices.put("Steinway",  25000);
		instrumentPrices.put("Baldwin", 16500);
		instrumentPrices.put("Yamaha", 19000);
		instrumentPrices.put("Gibson", 7000);
		
		System.out.println( instrumentPrices.get("Steinway") );
		System.out.println( instrumentPrices.get("Baldwin") );
		System.out.println( instrumentPrices.get("Yamaha") );
		System.out.println( instrumentPrices.get("Gibson") );
	}

}
