package class_design.class_inheritance.abstract_classes;

/*
 * we will learn about : 
 * -class inheritance
 * -how to extend class
 * -class hierarchy
 * -constructor definition rules
 * -calling inherited class members
 */

public class class_inheritance {

	public static void main(String[] args) {
		
		/*
		 * to extend class, we use keyword extend
		 */
		
		husky husky = new husky(5);
		
		husky.printDetails();
//		dog dog = new dog(3);
//		dog.setName1("Rex");
//		dog.printDetails();  // can't access because it is inside child class of dog
//		dog.printDetails1(); // can access because it's from parent class						
		// the line above print Animal, Dog, Husky
		// order of initialization rule
		
		husky.eat();
		
		System.out.println("tail length= " + husky.getTailLength());
		
		husky.run(10);
		/*
		 * if we remove getTailLength from husky class, we will get
		 * tail length = 5 cause it comes from dog class
		 */
		
		System.out.println("avg= " + husky.getAverageWeight());
		
		
		Bear bear = new Bear();
		bear.setName1("Jimmy");
		bear.setAge(10);
		bear.eatMeat();
		bear.eatPlants();
		bear.printDetails1();
		
		rabbit rabbit = new rabbit();
		rabbit.eatPlants();
		rabbit.printDetails1();
		
		cat cat = new cat(3);
		int speed = cat.getSpeed();
		System.out.println("cat speed is= " + speed);

	
//		Animal animal = new Animal(); // compilation error. we can't instantiate because animal class is abstract
		
//		animal_abstract animal = new animal_asbtract();  // cannot instantiate because animal_asbtract class is abstract
		
		/*
		 * whenever we instantiate 1 class, if there is a parent,
		 * automatically constructor of the parent is called, and
		 * compiler generates super() in the instantiated class
		 */
		
		/*
		 * order of initialization
		 * 1) if there is superclass initialize it first
		 * 2) static variable declarations and static initializers in
		 * order they appear in the file
		 * 3) instance variable declarations and instance initializers in order
		 * they appear in the file
		 * 4) the constructor 
		 */
		
		/*
		 * constructor definition rules : 
		 * 1) The first statement of every constructor is a call to another constructor
		 * within the same class using this(), or a call to parent class constructor
		 * using super().
		 * 2) If super() call is NOT declared in a constructor compiler will insert no
		 * argument super() as the first statement of the constructor
		 * 3) The super() call can't be used after the first statement of the constructor
		 * 4) If the parent class does not have no-argument constructor and the child does not
		 * define any constructors, compiler will show error and try to insert a default no-argument
		 * constructor into child class
		 * 5) If the parent does not have a no-argument constructor, the compiler requires an explicit
		 * call to a parent constructor in each child class
		 */
		

	}

}
