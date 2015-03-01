import java.awt.Graphics;
import java.awt.Polygon;

public class octagon implements Shape {

	private String title;
	private Point titleLocation;

	private String description;
	private Point descriptionLocation;

	public octagon(Graphics g) {

		title = "Octagon";
		titleLocation = new Point(25, 320);

		description = "A octagon has 8 sides";
		descriptionLocation = new Point(140, 521);

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
		g.drawString(title, titleLocation.getX(), titleLocation.getY());
	}

	public void displayNumSides(Graphics g) {
		g.drawString(description, descriptionLocation.getX(),
				descriptionLocation.getY());
	}
}
