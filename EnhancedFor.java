package examples;

import java.util.ArrayList;

public class EnhancedFor {
	public static void main(String[] args){
		int[] numbers =
			{1,2,3,4,5,6,7,8,9,10};
		for (int item : numbers){
			System.out.println("Count is: " + item);
		}
		
		ArrayList<String> Cats = new ArrayList<>();
		Cats.add("calico");
		Cats.add("black");
		Cats.add("spotted");
		Cats.add("Persian");
		
		for (String type : Cats){
			System.out.println("Is your cat " + type + "?");
		}
	}
}
