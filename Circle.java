package edu.monmouth.shape;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		super();
		setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius > 0) {
	        this.radius = radius;
	    } else {
	        this.radius = 0;
	    }
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double area() {
		return radius * radius;
	}
}
