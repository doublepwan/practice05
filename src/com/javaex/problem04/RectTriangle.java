package com.javaex.problem04;

public class RectTriangle extends Shape {

	double width;
	double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {

		return (width * height) / 2;
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(width * width + height * height);
	}

}
