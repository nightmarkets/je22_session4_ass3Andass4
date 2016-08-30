package com.session4.ass3Inheritance;

public class Triangle extends Shape {
public Triangle(double w, double h){
	super(w,h);
}
public double area(){
	return (width*height)/2;
}
}
