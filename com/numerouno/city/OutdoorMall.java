package examples.com.numerouno.city;

public class OutdoorMall extends Mall {
	
	private int picnicTableCount;

	public int getPicnicTableCount() {
		return picnicTableCount;
	}

	public void setPicnicTableCount(int picnicTableCount) {
		this.picnicTableCount = picnicTableCount;
	}
	
	public OutdoorMall() {
		super();
	}

	public OutdoorMall(int shopCount, boolean eatery, String name,
			int picnicTableCount) {
		super(shopCount, eatery, name);
		this.picnicTableCount = picnicTableCount;
	}
	
	@Override
	public String toString() {
		return name + " is an outdoor mall featuring " + shopCount + " shops and " 
				+ picnicTableCount + " picnic tables for your consuming & convenience pleasure! ";
	}

}
