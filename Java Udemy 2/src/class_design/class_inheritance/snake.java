package class_design.class_inheritance;

public class snake extends reptile {
	
	@Override
	protected boolean hasLegs() {
		return false;
	}
	
	@Override
	// can use public or protected
	public double getWeight() {
		return 10;
	}

}
