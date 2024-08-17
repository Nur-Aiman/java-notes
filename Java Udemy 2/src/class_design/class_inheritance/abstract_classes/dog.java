package class_design.class_inheritance.abstract_classes;


/*
 * -dog class is child class of animal
 * -animal class is parent class of dog
 */
public abstract class dog extends animal implements HasTail, CanRun{
	
	/*
	 * -we can use methods and variables from parent class
	 * -if the parent's variable is private, we can access the 
	 * variables through getters and setters
	 */
	
	public dog(int age) {
		super(age);
		System.out.println("Dog");
		this.name = name;
//		this.age = age;  // cannot access age from animal class cause it is 'private'
//		this.name1 = name1;
	}
	
	   // method overriding from animal class
	   // child class override method from parent class	
	   // we can't override private or final method, but we can override public method
		@Override
		public void eat() {
			super.eat();
			System.out.println("Dog eating");
		}
		// method overriding
		public double getAverageWeight() {
			return super.getAverageWeight() + 20; 
		}
		
		// method overriding
		// we can't override this method because it is 'final'
//		public double getAverageWeight() {
//			return 10.0;
//		}
		
		@Override
		public int getTailLength() {
			return 5;
		}
		
		
	
}
