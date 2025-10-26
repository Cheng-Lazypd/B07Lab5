package shapes;

public class Circle {
	//fields
	Point A;
	double radius;
	
	//constructors
	public Circle(Point A, double radius) {
		this.A = A;
		this.radius = radius;
	}
	
	//methods
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
}