package examples.com.numerouno.city;

public class Mall {
	
	public int shopCount;
	public boolean eatery = true;
	public String name;
	
	public Mall(int shopCount, boolean eatery, String name) {
		super();
		this.shopCount = shopCount;
		this.eatery = eatery;
		this.name = name;
	}
	
	public Mall() {
		
	}
	
	public void eaterycheck() {
		if(eatery = true){
			System.out.println("There is a food court here at " + name + ".");
		
		}
		else {
			System.out.println("There is no food court here at " + name + ".");
			
		}
	}

	public int getShopCount() {
		return shopCount;
	}

	public void setShopCount(int shopCount) {
		this.shopCount = shopCount;
	}

	public boolean isEatery() {
		return eatery;
	}

	public void setEatery(boolean eatery) {
		this.eatery = eatery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasEatery() {
		return eatery;
	}

	public void setOpen(boolean eatery) {
		this.eatery = eatery;
	}
	
	

}
