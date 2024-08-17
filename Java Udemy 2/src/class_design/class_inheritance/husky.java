package class_design.class_inheritance;

public class husky extends dog {
	
	public husky(int age) {
		
		// super() is automatically generated if the class 
		// is a child class
//		super(); // call constructor in parent class
		super(age);
		System.out.println("Husky");
		
		
	}
	
	
	public void printDetails() {
		System.out.println("name= " + getName1() + " age= " + getAge());
	}
	
	   // method overriding from animal class
	   // child class override method from parent class	
	   // we can't override private or final method, but we can override public method
		@Override
		public void eat() {
//			super.eat();
			System.out.println("Husky eating");
			
			super.eat();
		}
	
	
	

}
