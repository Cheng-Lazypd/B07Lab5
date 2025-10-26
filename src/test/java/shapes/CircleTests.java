package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testConstructor() throws Exception{
		Point p = new Point(1.0, 2.0);
		double r = 1.0;
		Circle c = new Circle(p, r);
		assertEquals(p, c.A);
		assertEquals(r, c.radius);
	}
	
	@Test
	void testPerimeter() throws Exception{
		Point p = new Point(1.0, 2.0);
		double r = 1.0;
		Circle c = new Circle(p, r);
		double l = 2 * Math.PI * r;
		assertEquals(l, c.perimeter());
	}
	
	@Test
	void testArea() throws Exception{
		Point p = new Point(5.0, 6.0);
		double r = 3.3;
		Circle c = new Circle(p, r);
		double s = Math.PI * r * r;
		assertEquals(s, c.area());
	}
}
