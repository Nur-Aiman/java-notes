package methods.using_static_methods_and_fields_part1;

public class Static {
	
	private String name = "Static";
	
	public static void one() {}
	public static void two() {}
	public static void three() {
		one();
		two();
//		three(); // recursive
//		four(); // we cannot call four because four() is not a static method
		four1();
//		System.out.println(name);  // we cannot use non-static constant in a static method
	}
	
	// non static method can call static method
	
	public void four() {
		one();
		two();
		three();
		System.out.println(name);
	}
	
	public static void four1() {
		one();
		two();
		three();
//		System.out.println(name);  // we cannot use non-static constant in a static method
	}
	
	public static void main(String[] args) {
		Static.one();
		two();
		three();
//		four();  // cannot call because this method is not static
		four1();
		
		// in order for static method to use non static method, 
		// need to create instance first
		
		Static myInstance = new Static();
		myInstance.four();
		
		new Static().four();
	}
	
	

}
