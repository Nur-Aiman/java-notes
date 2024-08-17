package arrays;

/* 
 * we will learn about : 
 * -structure of for each loop
 * -examples how to use for each loop
 */

public class for_each_loop {

	public static void main(String[] args) {
		
		/*
		 * - for each loop is also known as the enhance version of for loop
		 * - for each loop give us more convenient way to loop array, specifically if we don't need index
		 * - for each loop is only for array
		 * 
		 *  
		 */
		
		String[] names = {"Jimmy", "John", "Tom", "Anthony"}; {
			
			for(int i = 0; i < names.length; i++) {
				System.out.println("name= " + names[i]);
			}
			
			for(String name : names) {
				System.out.println("name= " + name);
			}
			
			/*
			 * -inside for each loop we can't define a local variable
			 * 
			 * 
			 */
			
			
			for(String name : names) {
				name = name + " " + name;
			}
			
			for(String name : names) {
				System.out.println("name= " + name);
			}
			
			StringBuilder[] builders = {
					new StringBuilder("For"),
					new StringBuilder("Loop")
			};
			
			for(StringBuilder builder : builders) {
				System.out.println(builder);
			}
			
			for(StringBuilder builder : builders) {
				builder.append("123");
			}
			
			for(StringBuilder builder : builders) {
				System.out.println(builder);
			}
			
			String pets = "Parrots";
			
//			for(String pet : pets) {} // does not compile
			
//			for(int name : names) {}  // does not compile
			
			for(char c : pets.toCharArray()) {
				System.out.println(c);
			}
				
			
		}
		

	}

}
