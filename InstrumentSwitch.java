package examples;

import java.util.ArrayList;

public class InstrumentSwitch {
	
public static void main(String[] args) {
		
		ArrayList<String> baltimoreSales = new ArrayList<String>();
		baltimoreSales.add("Fender Mustang guitar");
		baltimoreSales.add("Ludwig maple kit");
		baltimoreSales.add("Fender P bass");
		
		ArrayList<String> austinSales = new ArrayList<String>();
		austinSales.add("Takamine acoustic guitar");
		austinSales.add("Gibson acoustic guitar");
		austinSales.add("Pearl export drum kit");
		austinSales.add("Roland stage piano");
		
		ArrayList<String> sandiegoSales = new ArrayList<String>();
		sandiegoSales.add("Casio CX-90");
		sandiegoSales.add("Shure sm-57 microphone");
		
		String city = "San Diego";
		
		switch (city) {
		
		case "Baltimore": System.out.println("There are " + baltimoreSales.size() + " instruments for sale in this city. They are: ");
						for (String instruments: baltimoreSales){
							System.out.println(instruments);							
						} 
						break;
			
		case "Austin": System.out.println("There are " + austinSales.size() + " instruments for sale in this city. They are: ");
						for (String instruments: austinSales){
							System.out.println(instruments);
						}
						break;
		
		case "San Diego": System.out.println("There are " + sandiegoSales.size() + " instruments for sale in this city. They are: ");
						for (int i = 0; i < sandiegoSales.size(); i++ ){
							System.out.println(sandiegoSales.get(i));
						}
						break;
		
		

	  }

   }
}


