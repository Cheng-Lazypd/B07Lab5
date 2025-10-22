package shapes;

import java.awt.Point;

public class Ellipse {
	private Point P1;//focus of the ellipse
	private Point P2;
	private double a;//the semi-major axis of the ellipse
	
	public Ellipse(Point P1, Point P2, double a) {
		this.P1=P1;
		this.P2=P2;
		this.a=a;
	}

	public double Eccent() {
		double c = this.P1.distance(this.P2)/2;
		return c/this.a;
	}

	public double ComputeArea() {
		double c = this.P1.distance(this.P2)/2;
		double b = Math.sqrt(this.a*this.a - c*c);
		return this.a*b*Math.PI;
	}

	public double ComputePerimeter(){
		double c = this.P1.distance(this.P2)/2;
		double b = Math.sqrt(this.a*this.a - c*c);
		return Math.PI*(3*(this.a + b) - Math.sqrt((3*this.a + b)*(this.a + 3*b)));
	}
}