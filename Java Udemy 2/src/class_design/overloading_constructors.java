package class_design;
/*
 * we will learn : 
 * -how to overload constructors
 * -how overloaded constructors work
 * -how to chain constructors
 */

class Dogg {
	private String name;
	private String breed;
	private double weight;
	
	public Dogg(String name) {
//		this.name = name;
//		breed = "husky";
//		weight = 30.0;
//		Dogg(name, "husky"); // compilation error
//		new Dogg(name, "husky");  // create another instance of dog (not what we want)
//		System.out.println("constructor 1");
		
		// this code below must be the first statement in the constructor body
		this(name, "husky");  // will call 2nd constructor
		System.out.println("constructor 1");
	}
	
	public Dogg(String name, String breed) {
//		this.name = name;
//		this.breed = breed;
//		weight = 30.0;
		this(name, breed, 30.0);
		System.out.println("constructor 2");
	}
	
	public Dogg(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		System.out.println("constructor 3");
	}
	
	public void print() {
		System.out.println(name + " " + breed + " " + weight);
	}
}
	
public class overloading_constructors {

	public static void main(String[] args) {
		Dogg dog1 = new Dogg("Jimmy");
		dog1.print();
		
		Dogg dog2 = new Dogg("Anthony", "Shepard");
		dog2.print();
		
		Dogg dog3 = new Dogg("Rex", "German Shepard", 40);
		dog3.print();
		

	}

}
