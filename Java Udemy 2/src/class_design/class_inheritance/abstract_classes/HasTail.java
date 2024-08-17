package class_design.class_inheritance.abstract_classes;

public interface HasTail {
	
//	public static final int DEFAULT_TAIL_LENGTH = 2; //public static final is redundant. that modifier has been initialize by default
	int DEFAULT_TAIL_LENGTH = 2;
	
//	public int getTailLength(); // public is redundant. method in interface is by default public and abstract
//  method in interface cannot be private and protected
//	public abstract int getTailLength(); // public and abstract is redundant. method in interface is by default public and abstract
	
	int getTailLength();
	
//	int getWeight(); {}  // compilation error. method in interface cannot have body
}
