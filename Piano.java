package examples;

public class Piano {
	
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
	  }
    }
