package arrays;

/*
 * we will learn about : 
 * -break statement structure
 * -how break statemnent works
 * -how to use break statement
 */

public class break_statement_and_labels {

	public static void main(String[] args) {
		
//		myLabel:
//			int[] myArray = {1, 2, 3};
		
		
		myLabel: 
		{
			int[] myArray = {1, 2, 3};
		}
		
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nloop 1");
		MY_LOOP: for(String animal : animals) {
			if(animal.equals("Cat")) {
				break MY_LOOP;
			}
			
			System.out.println(animal);
		}
		
		System.out.println("\nloop 2");
		
		animal: for(String animal : animals) {
			if(animal.equals("Cat")) {
				break animal;
			}
			System.out.println(animal);
		}
		
		
		System.out.println("\nloop 3");
		
		
		for(String animal : animals) {
			if(animal.equals("Lizard")) {
				break;
			}
			
			System.out.println(animal);
		}
		
		System.out.println("\nloop 4");
		
		int index = 0;
		while(index < animals.length) {
			String animal = animals[index];
			
			if(animal.equals("Lizard")) {
				break;
			}
			
		System.out.println(animal);
		index++;
		}
		
		

	}

}
