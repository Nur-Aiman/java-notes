package arrays;

/* we will learn : 
 * -continue statement structure
 * -how continue statement works
 * -how to use continue statement
 */

public class continue_statement {

	public static void main(String[] args) {
		
		/*
		 * -'break' quit the loop
		 * -'continue' skip the current iteration
		 */
		
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		
		System.out.println("loop 1");
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nloop 2");
		
		MY_LOOP:
			for(String animal : animals) {
				if(animal.equals("Cat")) {
					continue MY_LOOP;
				}
				
				System.out.println(animal);
			}
		
		
		System.out.println("\nloop 3");
		
		animal:
			for(String animal : animals) {
				if(animal.equals("Cat")) {
					continue animal;
				}
				
			System.out.println(animal);
			}
		
		System.out.println("\nloop 4");
		
		for(String animal : animals) {
			if(animal.equals("Lizard") || animal.equals("Cat")) {
				continue;
			}
			
		System.out.println(animal);
		}
		
		System.out.println("\nloop 5");
		
		int index = 0;
		while (index < animals.length) {
			
			String animal = animals[index];
			index++;
			
			if(animal.equals("Lizard")) {
				continue;
			}
			
			System.out.println(animal);
		}

	}

}
