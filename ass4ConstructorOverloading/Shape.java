
package com.session4.ass4ConstructorOverloading;

public class Shape {
private double width;
private double height;
protected double area;

public Shape (double w, double h){
	area = w*h;
}

public Shape (double w){
	area = w*w;
}
}
