package class_design.class_inheritance.abstract_classes;

public interface Run extends Walk {

	// this getSpeed() below will override the getSpeed() 
	// from Walk interface
	default int getSpeed() {
		return 10;
	}
}
