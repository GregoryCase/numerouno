package examples;

import java.util.ArrayList;

public class salesLocations {

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

		if (city == "San Diego") {
			System.out.println("There are " + sandiegoSales.size()
					+ " instruments for sale in this city. They are: ");

			for (String instrument : sandiegoSales) {
				System.out.println(instrument);

			}
		} else if (city == "Austin") {
			System.out.println("There are " + austinSales.size()
					+ " instruments for sale in this city. They are: ");

			for (String instrument1 : austinSales) {
				System.out.println(instrument1);
			}

		}

		else if (city == "Baltimore") {
			System.out.println("There are " + baltimoreSales.size()
					+ " instruments for sale in this city. They are: ");

			for (String instrument2 : baltimoreSales) {
				System.out.println(instrument2);
			}

		}

	}
}
