package examples;

public class Guitar {
	
	private int year;
	private String brand;
	private String model;
	private String finish;
	
	public Guitar(int year, String brand, String model, String finish){
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.finish = finish;
			}
	
	public String toString() {
		return "We currently have for sale a " + this.year + " " + this.brand + " " + this.model + " with a " + this.finish + " finish.";  
	  }
	
	  public static void main(String[] args) {
		  Guitar Gibson = new Guitar (1987, "Gibson", "Explorer", "sunburst");
		  System.out.println(Gibson);
	  }
	  
}
