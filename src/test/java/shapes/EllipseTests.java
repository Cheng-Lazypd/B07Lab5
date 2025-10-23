package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EllipseTests {
	private static final double DELTA = 0.001;
	@Test
	void testEllipseCreation() {
		Point focus1 = new Point(0,0);
		Point focus2 = new Point(4,0);
		Ellipse ellipse = new Ellipse(focus1, focus2, 3.0);
        assertNotNull(ellipse);
	}
	@Test
	void testEllipseEccent() {
		Point focus1 = new Point(0, 0);
        Point focus2 = new Point(4, 0);
        Ellipse ellipse = new Ellipse(focus1, focus2, 3.0);
        double ExpectedEccent = 2.0/3.0;
        assertEquals(ExpectedEccent,ellipse.Eccent(),DELTA); 
	}
	@Test
    void testEllipseComputeArea() {
        Point focus1 = new Point(0, 0);
        Point focus2 = new Point(4, 0);
        Ellipse ellipse = new Ellipse(focus1, focus2, 3.0);
        double c = 2.0;
        double b = Math.sqrt(3*3 - c*c);
        double expectedArea = Math.PI * 3.0 * b;
        assertEquals(expectedArea, ellipse.ComputeArea(), DELTA);
	}
}
