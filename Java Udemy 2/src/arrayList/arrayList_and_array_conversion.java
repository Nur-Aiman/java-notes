package arrayList;
/*
 * we will learn about : 
 * -convert ArrayList to Array
 * -convert Array to ArrayList
 * -tricks for exam
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList_and_array_conversion {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Tony");
		names.add("Jimmy");
		names.add("Anthony");
		names.add("Anthony");
		
		System.out.println("names arrayList : ");
		System.out.println(names);
		System.out.println(names.remove("Anthony"));
		System.out.println(names);
		
		Object[] namesArray = names.toArray();
		System.out.println(namesArray.length);
		
		String[] stringArray = names.toArray(new String[0]);
		String[] anotherStringArray = names.toArray(new String[names.size()]);
		
		String[] petsArray = {"dog", "cat", "parrot"};
//		List<String> petsList = Arrays.asList(petsArray);
		
		List<String> petsList = Arrays.asList("dog", "cat", "parrot");  // return fixed size list
		System.out.println(petsList.size());
		
		petsList.set(0, "bird");
		System.out.println(petsList);
		System.out.println(Arrays.toString(petsArray));
		
		petsArray[0] = "husky";
		System.out.println(petsList);
		System.out.println(Arrays.toString(petsArray));
		
//		petsList.add("newDog");  // not supported
//		petsList.remove(1); // not supported
		
		List<String> list = Arrays.asList("one", "two", "three");
		System.out.println(list);
//		list.add("four"); // not supported
		
		// you can change but cannot add or remove
		
		

	}

}
