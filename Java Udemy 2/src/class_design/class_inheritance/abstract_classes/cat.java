package class_design.class_inheritance.abstract_classes;

// cannot implement Walk and Run if Run does not inherit Walk
// cause will cause conflict at both getSpeed() method
public class cat extends animal implements Run {
	
	public cat(int age) {
		super(age);
	}

	@Override
	protected void printName() {
		// TODO Auto-generated method stub
		
	}
	
	// if cat does not call getSpeed(), the default method will be use
	
	@Override
	public int getSpeed() {
		return 15;
	}

}
