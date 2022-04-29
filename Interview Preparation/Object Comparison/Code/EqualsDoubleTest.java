package com.test.core.equal;

public class EqualsDoubleTest {

	public static void main(String[] args) {

		Double a = 10.0;
		Double b = 10.0;
		Double c = new Double(10.0);

        //	== operators used for reference comparison (address comparison) 
        //	.equals() method for content comparison. 

        //	== checks if both objects point to the same memory location 
        //	whereas .equals() evaluates to the comparison of values in the objects

		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // true
		System.out.println(a == c); // false 

		// (1) - special case false ( Address might be different )
		
		// (2),(3) - same content

		// (4) - new keyword forces a new memory location to be created
		// Different memory reference but same content
		
		// Double c = new Double("ABC");
		// NumberFormatException - if the String does not contain a parsable number
        // java.lang.Double.Double(String s) throws NumberFormatException
	}

}
