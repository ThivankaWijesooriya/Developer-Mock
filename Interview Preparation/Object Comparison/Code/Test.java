package com.test.core.equal;

public class Test {

	public static void main(String[] args) {
		
		Integer a = 10;
		Integer b = 10;
		Integer c = a;
		
		Integer d = new Integer(20);
		Integer e = new Integer(20);
		Integer f = d;
		
		// TRUE
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c == b);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(c.equals(b));
		
		System.out.println(d == f);
		System.out.println(d.equals(e));
		System.out.println(d.equals(f));
		System.out.println(f.equals(e));
		
		// FALSE
		System.out.println(d == e);
		System.out.println(f == e);
		
	}

}
