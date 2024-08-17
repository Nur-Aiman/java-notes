package java_basics;

import static java.lang.Math.*;
import static java_basics.Config.*;


/*
 * - learn how to use static import
 * - learn how to import custom static members
 * 
 */

public class static_imports {

	public static void main(String[] args) {
		/*
		 * -static import are used to import static 
		 * member of classes, which are usually constant or method
		 * -usually for static import you don't have to specify class name
		 * where each static method or variable come from
		 * 
		 */
		
		/*
		 * 
		 */
		
		/*
		 * -math class contains only static constants or static method
		 * -
		 */
		
		// static method
		int min = Math.min(5, 7);
		/*
		 * if you want to import non-statically, write like this :
		 * import static java.lang.Math.*;
		 * 
		 *  int min = min(5,7);
		 *  int PI = PI;
		 * 
		 */
		
		System.out.println("min = " + min);
		// static constant
        System.out.println(Math.PI);
        
        
        /*
         * for System.out.println, can also write like this : 
         * 
         * import static java.lang.System.out;
         * 
         * out.println(PI);
         */
        
        /*
         * -static imports are for importing static members
         * -regular imports are for importing classes
         * 
         */
        
        printConfig();
	}

}
