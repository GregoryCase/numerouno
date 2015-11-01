package examples;

public class Wheel {

	  private int diameter;
	  private int width;
	  private String type;
	  private String brand;

	  public Wheel() {
	    diameter = 17;
	    width = 9;
	    type = "allSeason";
	    brand = "toyo";
	  }

	  public Wheel(int diameter, int width, String type, String brand) {
	    this.diameter = diameter;
	    this.width = width;
	    this.type = type;
	    this.brand = brand;
	  }

	  public String toString() {
	    return "I have a diameter of " + diameter + ", a width of " + width + ", is an " + type + " type, and is the brand " + brand + "!" ;
	  }

	  public static void main(String[] args) {
	    Wheel two = new Wheel();
	    System.out.println(two);
	    Wheel three = new Wheel(19, 10, "winter", "Goodyear");
	    System.out.println(three.toString());
	  }
	}
