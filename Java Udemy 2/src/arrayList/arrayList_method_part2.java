package arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * we will learn : 
 * -more important method
 * -isEmpty(), size(), clear(), contains(), equals()
 */

public class arrayList_method_part2 {

	public static void main(String[] args) {
		
		List<String> pets = new ArrayList<>();
		
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		
		if(pets.isEmpty()) {
			System.out.println("no pets");
		}
		
		if(pets.size() == 0) {
			System.out.println("no pets");
		}
		
		pets.add("cat");
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		
		pets.clear();
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		
		pets.add("dog");
		System.out.println(pets.contains("cat"));  // false
		System.out.println(pets.contains("dog"));  // true
		
		// method 'equals' check if 2 objects is equivalent or have same data
		
		// for list, both must have same element in the same order
		
		List<String> newPets = new ArrayList<>();
		newPets.add("dog");
		
		System.out.println(pets.equals(newPets));
		
		newPets.add("cat");
		
		System.out.println("Pets : " + pets);
		System.out.println("newPets : " + newPets);
		System.out.println(pets.equals(newPets));
		
		pets.add(0, "cat");
		
		System.out.println("Pets : " + pets);
		System.out.println("newPets : " + newPets);
		System.out.println(pets.equals(newPets));
		
		// size and element are equal but order of element is not equal
		// size, element, and order must be equal
		

	}

}
