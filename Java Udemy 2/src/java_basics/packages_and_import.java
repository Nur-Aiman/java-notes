package java_basics;

import java.util.Random;
import java.lang.System;

/*
 * - will learn how to create packages
 * - learn what are child packages
 * - how to use import
 * - how to import existing classes
 */

public class packages_and_import {

	public static void main(String[] args) {
		/*
		 * if we create packages with name like
		 * "banking.loan", 2 new package will be created
		 * one is "banking" package and another one is
		 * "loan" package, which is a child package
		 * "banking" is parent package
		 * "loan" is child package
		 * 
		 */
		
		/* import example
		 * 
		 * -package java_basics;
		 * -import java.util.Random;
		 * -by default, java.lang is imported automatically
		 * -we only need to import package other than java.lang
		 * -if we don't import properly, we will get compilation error
		 * -import need to be above class
		 * 
		 * star import : import java.util.*; 
		 *
		 */
		
		Random random = new Random();
		System.out.println(random.nextInt(5));
		
		/*
		 * in exam you can rewrite the code on paper especially
		 * when the code does not have proper indentation
		 * 
		 */
		

	}

}
