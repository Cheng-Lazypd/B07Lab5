package shapes;

public class Ellipse {
	private Point P1;//focus of the ellipse
	private Point P2;
	private double a;//the semi-major axis of the ellipse
	
	public Ellipse(Point P1, Point P2, double a) {
		this.P1=P1;
		this.P2=P2;
		this.a=a;
	}
	
	public double ComputeArea() {
		double c= P1.distance(P2)/2;
		double b=Math.sqrt(a*a-c*c);
		return a*b*Math.PI;
	}
}
