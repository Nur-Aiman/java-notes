package understanding_strings;

/*
 * we will learn about : 
 * -string immutability
 */

public class string_immutability {

    public static void main(String[] args) {
        // 1. Here, a new string "hello" is created and the reference 'hello' points to it.
        String hello = "hello";
        
        /*
         * -immutable means, after you create a string,
         * you can't change it
         * -mutable is changeable, so immutable is non-changeable
         */
        
        // 2. Here, the '+' operator is used to concatenate two strings. 
        // A new string "helloworld" is created in memory and the reference 'hi' points to it. 
        // The original string "hello" remains unchanged.
        String hi = hello + "world";
        
        // 3. Now, the reference 'hi' is pointed to the original "hello" string. 
        // The "helloworld" string is still in memory, but there's no variable referencing it (in this code).
        hi = hello;
        
        // 4. Since 'hi' is now pointing to the "hello" string, this is essentially doing "hello" + "hello", 
        // resulting in the output "hellohello".
        System.out.println(hi + hello);
        
        hello.toUpperCase();
        
        /*
         * for the below code, the output is 'hello' not
         * 'HELLO' because string is immutable
         */
        System.out.println(hello);
        
        // hello is now referencing to HELLO
        hello =  hello.toUpperCase();
        System.out.println(hello);
        
        /*
         * -string cannot be change
         * -variables are references to the string
         * -they reference string object in memory
         * -we are just changing the reference
         * -the hello.toUpperCase() create new string
         * -we reference the 'hello' variable to the newly created string
         *          
         *          */
        
        // concat
        String s1 = "1";
        String s2 = s1.concat("2"); // 12 // creating a new string and assign it to s2
        s2.concat("3"); // we create new string but we not assign to any variable. s2 does not change
        
        System.out.println(s1); //1
        System.out.println(s2); //12
        
        s2 = s2.concat("3");
        System.out.println(s2); //123
    }
}
