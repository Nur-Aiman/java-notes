package operators;

import java.lang.Integer.IntegerCache;

import jdk.internal.vm.annotation.IntrinsicCandidate;

/*
 * we will learn about : 
 * -understanding the difference between == and equals() method
 * -how to check object equality
 * -we how to prove how 128 is not equal to 128 in java 
 *  (128 != 128)
 */

public class understanding_equal_sign_and_equals_method {

	public static void main(String[] args) {
		
		/*
		 * -need to be careful when comparing objects and primitives
		 * -objects are compared using equals() method
		 * -primitive are compared using == operators
		 * 
		 * -when using == methods for object, we are comparing objects references. or
		 * we can say we are comparing memory locations or memory addresses of 2 objects
		 * 
		 */
		
		// comparing objects
		Integer myInteger = 127;
		Integer myAnotherInteger = 127;
		
		System.out.println(myInteger == myAnotherInteger); // true
		
		System.out.println("128 == 128 : " + (128 == 128));  // true
		
		myInteger = 128;
		myAnotherInteger = 128;
		
		System.out.println("myInteger = " + myInteger);
		System.out.println("myAnotherInteger = " + myAnotherInteger);
		System.out.println(myInteger == myAnotherInteger); // false
		
		/*
		 * why the comparison become false : 
		 * -when we assign 128 to myInteger, we are assigning the int value. We have autoboxing in action
		 * -it will be the same if we type myInteger = Integer.valueOf(128);
		 * 
		 * @IntrinsicCandidate
        public static Integer valueOf(int i) {
            // it will check whether the given i is withing the range of 
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
    }
		 * 
		 */
		
		// myInteger = 128;
		Integer.valueOf(128);
		
		

	}

}
