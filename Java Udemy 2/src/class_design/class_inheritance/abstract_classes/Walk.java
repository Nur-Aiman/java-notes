package class_design.class_inheritance.abstract_classes;

public interface Walk {
	
	default int getSpeed() {
		return 5;
	}

}
