package com.exceptions;

public class Multicatch {
	public static void main(String[] args) {


try {

int x = Integer.parseInt("0");

System.out.println(x);

int y= 1000 / x;

System.out.println(y);

int[] marks = null;

System.out.println(marks[0]);

} catch (ArithmeticException e) {

System.out.print("Dont enter 0:"); System.out.println(e.getMessage());

} catch (NumberFormatException e) {

System.out.print("Dont enter string values:");

System.out.println(e.getMessage());

} catch (Exception e) {

System.out.println("other");

System.out.println(e.getMessage());

}

System.out.println("Continue with the program");

}}
