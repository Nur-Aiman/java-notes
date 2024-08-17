package class_design;

import class_design.default_constructor.Dog;

/*
 * we will learn about :
 * -what are constructors
 * -how to use constructor
 * -keyword 'this'
 */

class Dog {
	
	private String color;
	
	public Dog(String color) {
		System.out.println("constructor");
		color = color;
		this.color = color;
	}
	
	public void printColor() {
		System.out.println("color= " + this.color);
	}
	
//	public dog() {}  // cannot compile because constructor name differs from class name
//	public void Dog() {}  // not constructor because it has return type 
}

class Cat {
	private String color;
	private int height;
	private int length;
	
	public Cat(int length, int theHeight) {
//		length = this.length;  // exam trick
		this.length = length;
		height = theHeight;
		this.color = "white";  // or color = "white";
		
	}
	
	public void printInfo() {
		System.out.println("Cat length= " + this.length + " height= " + this.height + " color= " + this.color);
	}
}

public class class_constructors {

	public static void main(String[] args) {
		Dog dog = new Dog("gray");
		dog.printColor();
		
		/*
		 * -static initializer initialize static variable
		 * -constructor initialize instance variable
		 */
		
		Cat cat = new Cat(10, 12);
		cat.printInfo();

	}

}
