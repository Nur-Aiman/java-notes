package arrayList;

import java.util.List;
import java.util.ArrayList;

/*
 * we will learn : 
 * -how to use ArrayList
 * -some important method of the arrayList class
 * -add(), remove(), set()
 */

public class arrayList_method_part1 {

	public static void main(String[] args) {
		
// line 17 is same as line 18
//		List list = new ArrayList();
		List<Object> list = new ArrayList<>();  // this one can insert data of any type
		list.add("dog");
		list.add(5);
		
		
		System.out.println(list);
//		System.out.println(list.toString());
		
		List<String> pets = new ArrayList<>();
		pets.add("dog");
		System.out.println(pets);
		
		pets.add(0, "cat");
		System.out.println();
		
//		pets.add(5); // compilation error
		// 0  ,  1
		// cat, dog
		pets.add(1, "parrot"); // cat, parrot, dog
		pets.add(0, "husky"); // husky, cat, parrot, dog
		pets.add(1, "bird"); // husky, bird, cat, parrot, dog
		System.out.println(pets);
		
		// remove
		pets.remove("parrot");
		System.out.println(pets);  // husky, bird, cat, dog
		
		pets.remove(2);
		System.out.println(pets);  // husky, bird, dog
		
//		pets[0] = "newBird"; // compilation error
		pets.set(0, "newBird");
		System.out.println(pets);  // newBird, bird, dog
		
		
//		pets.set(6, "myDog");  // Index 6 out of bounds for length 3
		System.out.println(pets);
	}

}
