package class_design.class_inheritance;

public class animal {
	
	// we can access private class using getters and setters
	
	private int age;
	protected String name;  // child classes can access this
	private String name1;
	
	public animal() {
		
	}
	
	public animal (int age) {
		System.out.println("Animal");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	// method overriding
	public void eat() {
		System.out.println("Animal is eating");
	}
	// method overriding for 'final' method
//	public final double getAverageWeight() {
//		return 10.0;
//	}
	
	public double getAverageWeight() {
		return 10.0;
	}
	
	
	// don't need to use getters and setters here cause 'name' and 'age' 
	// are in the same class
//	public void printDetails1() {
//		System.out.println("name= " + getName1() + "age= " + getAge());
//	}
	
	// can just write like this instead of write like above
	// this method is available to all child class
	// try to change below code from 'public', to 'protected', to 'private' and
	// see the changes
	public void printDetails1() {
		System.out.println("name= " + getName1() + " age= " + getAge());
	}
	

}
