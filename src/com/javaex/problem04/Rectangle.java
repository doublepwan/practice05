package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {

	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}

}
