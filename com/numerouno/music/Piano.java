package com.numerouno.music;

public class Piano extends InstrumentCondition {
	
	  private int year;
	  private String brand;
	  private String type;
	  private String finish;
	
	  public Piano(int year, String brand, String type, String finish) {
		this.year = year;
		this.brand = brand;
		this.type = type;
		this.finish = finish;
	  }
	
	  public String toString() {
		return "We currently have for sale a " + this.year + " " + this.brand + " " + this.type + " with a " + this.finish + " finish.";  
	  }
	
	  public static void main(String[] args) {
		Piano Steinway = new Piano (1979, "Steinway", "nine ft. grand", "black gloss");
		System.out.println(Steinway.toString());
		Piano Baldwin = new Piano (2006, "Baldwin", "baby grand", "natural");
		System.out.println(Baldwin.toString());
		Piano Yamaha = new Piano (1985, "Yamaha", "upright grand", "white gloss");
		System.out.println(Yamaha.toString());
		Piano.condition();		
	  }
    }
