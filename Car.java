package examples;

public class Car {

	  private String make;
	  private String model;
	  private String trim;

	  public Car(String make, String model, String trim) {
	    this.make = make;
	    this.model = model;
	    this.trim = trim;
	  }

	  public String toString() {
	    return "Ima " + this.make + " " + this.model + " " + this.trim;
	  }

	  public static void main(String[] args) {
	    Car bimmer = new Car("BMW", "135", "i");
	    System.out.println(bimmer.toString());
	  }
	}