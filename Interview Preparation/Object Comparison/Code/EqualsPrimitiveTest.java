package com.test.core.equal;

public class EqualsPrimitiveTest {

	public static void main(String[] args) {
		
		// integer-type
        System.out.println(10 == 20); // false
  
        
        // char-type
        System.out.println('a' == 'b'); // false
  
        
        // char and double type
        System.out.println('a' == 97.0); // true
        // Warning - Comparing identical expressions
        // ASCII value of 'a' is 97
        
        
        // boolean type
        System.out.println(true == true); // true
        // Warning - Comparing identical expressions
        
        
        // System.out.println(10 == "abc");
        // Incompatible operand types int and String

	}

}
