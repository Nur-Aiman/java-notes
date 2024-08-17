package class_design.class_inheritance.abstract_classes;

public class eagle extends bird {
	
	// overload
	public int fly(int height) {
		System.out.println("Eagle is flying at " + height + " meters");
		return height;
	}
	
	// override
	
	// fail to override
//	@Override
//	public int eat(int amount) {
//		return amount;
//	}

}
