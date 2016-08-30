
//Write a program to calculate area of rectangle and triangle using single inheritance.
//Should print the area of the rectangle and triangle.

package com.session4.ass3Inheritance;

public class TestInheritance {
	public static void main(String[] arg){
		double width1 = 10;
		double height1 = 20;
		Retangle myRetangle = new Retangle(width1, height1);
		Triangle myTriangle = new Triangle (width1, height1);
		
		System.out.println("Retangle area = "+ myRetangle.area());
		System.out.println("Triangle area = "+ myTriangle.area());
	}

}
