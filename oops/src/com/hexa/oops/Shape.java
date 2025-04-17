package com.hexa.oops;

public class Shape {
	void area(int x) {
		System.out.println("Sq"+Math.pow(x,2));
	}
	void area(double r) {
		System.out.println("Cir"+Math.PI*Math.pow(r,2));
	}
	int area(int x,int y) {
		return x*y;
	}
	double area(int len,float height) {
		return 0.5*len*height;
	}
	
}
