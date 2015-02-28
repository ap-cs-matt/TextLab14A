import java.awt.Graphics;
import java.awt.Polygon;

public class octagon implements Shape {

	public octagon(Graphics g) {

		drawShape(g);
		displayName(g, new Point(25,320));
		displayNumSides(g);

	}

	public void drawShape(Graphics g) {
		Polygon o = new Polygon();
		o.addPoint(147, 415);
		o.addPoint(180, 380);
		o.addPoint(230, 380);
		o.addPoint(263, 415);

		o.addPoint(263, 465);
		o.addPoint(230, 500);
		o.addPoint(180, 500);
		o.addPoint(147, 465);

		g.fillPolygon(o);

	}

	public void displayName(Graphics g) {
		g.drawString("Octagon", point.getX(),point.getY());

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A octagon has 8 sides", 140, 521);

	}

}
