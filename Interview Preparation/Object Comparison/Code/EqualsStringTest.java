package com.test.core.equal;

public class EqualsStringTest {

	public static void main(String[] args) {

		String a = "ABC";
		String b = "ABC";
		String c = new String("ABC");

        //	== operators used for reference comparison (address comparison) 
        //	.equals() method for content comparison. 

        //	== checks if both objects point to the same memory location 
        //	whereas .equals() evaluates to the comparison of values in the objects

		System.out.println(a == b); // true 
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // true
		System.out.println(a == c); // false 

		// (1)      - same memory reference
		// (2),(3)  - same content

		// (4) - new keyword forces a new memory location to be created
		// Different memory reference but same content

	}

}
