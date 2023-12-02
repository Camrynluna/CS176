package edu.monmouth.problemSet5;

import edu.monmouth.shape.*;

public class ProblemSet5 {
	
	public static void main(String[] args) {
		Rectangle invalidRectangle = new Rectangle(-9, -8);
		System.out.println("invalidRectangle length: " + invalidRectangle.getLength() + 
				" width: " + invalidRectangle.getWidth());
		
		Circle invalidCircle = new Circle(-7);
		System.out.println("invalidCircle radius: " + invalidCircle.getRadius());
		
		Rectangle smallRectangle = new Rectangle(3, 4);
		Rectangle largeRectangle = new Rectangle(300, 400);
		
		Circle smallCircle = new Circle(5);
		Circle largeCircle = new Circle(50);
		
		Shape rectangle = new Rectangle(8, 12);
		Shape circle = new Circle(10);
		
		System.out.println(smallRectangle);
		System.out.println(largeRectangle);
		System.out.println(smallCircle);
		System.out.println(largeCircle);
		System.out.println(rectangle);
		System.out.println(circle);
		
		printArea(smallRectangle);
		printArea(largeRectangle);
		printArea(smallCircle);
		printArea(largeCircle);
		printArea(rectangle);
		printArea(circle);
	}
	
	static void printArea(Shape shape) {
		System.out.println(shape.area());
	}

}