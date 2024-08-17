package methods.static_methods_and_fields;

public class launcher {

	public static void main(String[] args) {
		
		// call from static_methods_and_fields class
		static_methods_and_fields.main(args); 
		System.out.println(static_methods_and_fields.myNumber);

		// call from another_main
		// this is to show that main method can also be called like other static method
		another_main.main(args);
	}

}
