package com.test.core.equal;

public class EqualsIntegerTest {

	public static void main(String[] args) {

		Integer a = 10;
		Integer b = 10;
		Integer c = new Integer(10);
		Integer d = new Integer(10);

        //	== operators used for reference comparison (address comparison) 
        //	.equals() method for content comparison. 

        //	== checks if both objects point to the same memory location 
        //	whereas .equals() evaluates to the comparison of values in the objects

		System.out.println(a == b); // true 
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // true
		System.out.println(a == c); // false 
		System.out.println(a.equals(d)); // true 
		System.out.println(a == d ); // false 
		System.out.println(c == d ); // false 
		System.out.println(c.equals(d)); // true 
	
		// Integer c = new Integer("ABC");
		// NumberFormatException - if the String does not contain a parsable integer
        // java.lang.Integer.Integer(String s) throws NumberFormatException
	}

}
