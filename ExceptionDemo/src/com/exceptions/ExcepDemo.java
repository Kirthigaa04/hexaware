package com.exceptions;

public class ExcepDemo {
	public static void main(String[] args) {
		try {
			int x=Integer.parseInt("Priyaa");
			System.out.println(x);
			int y=1000/100;
			System.out.println(y);
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}
