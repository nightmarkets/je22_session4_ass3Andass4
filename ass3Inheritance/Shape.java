package com.session4.ass3Inheritance;

public abstract class Shape {
protected double width;
protected double height;
abstract double area();

public Shape(double w, double h){
	width = w;
	height = h;
}
}
