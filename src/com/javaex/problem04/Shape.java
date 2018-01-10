package com.javaex.problem04;

public abstract class Shape {
	int countSides;

	public Shape() {
	}

	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
	
}
