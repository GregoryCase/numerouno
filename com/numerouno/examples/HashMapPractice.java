package com.numerouno.examples;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<Integer, Integer> ages = new HashMap<>();
		ages.put(1983, 0);
		ages.put(1985, 2);
		ages.put(1989, 6);
		ages.put(1996, 13);
		ages.put(2001, 18);
		ages.put(2007, 24);
		ages.put(2013, 30);
		ages.put(2020, 37);
		ages.put(2033, 50);
		ages.put(2050, 67);
		ages.put(2077, 94);
		ages.put(2083, 100);

		for (int year : ages.keySet()) {

			if (year < 2020) {
				System.out.println("In the year " + year + " I was "
						+ ages.get(year) + " years old.");

			} else if (year >= 2020) {
				System.out.println("In the year " + year + " I will be "
						+ ages.get(year) + " years old!");

			} else if (year >= 2077) {
				System.out.println("In the year " + year + " I MAY live to be "
						+ ages.get(year) + " years old!");

			}

		}

	}

}
