package arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * we will learn : 
 * -what is arrayList
 * -how to create arrayList
 */

public class understanding_arrayList {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		ArrayList<Object> myList2 = new ArrayList<Object>();
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();  // diamond operator
		List<String> list3 = new ArrayList<>(); // using interface as type
		
//		ArrayList<String> list4 = new List<>(); // won't compile
		
		List<String> list5 = new ArrayList<>(20);
		
		// for array, we cannot change the size
		// for arrayList, we can change the size
		
		
		
		
		
		

	}

}
