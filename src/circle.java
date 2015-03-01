import java.awt.Graphics;
import java.awt.Polygon;

public class circle implements Shape {

	private String title;
	private Point titleLocation;

	private String description;
	private Point descriptionLocation;

	public circle(Graphics g) {

		title = "Circle";
		titleLocation = new Point(430, 320);

		description = "A circle has 0 sides";
		descriptionLocation = new Point(555, 521);

	}

	public void drawShape(Graphics g) {
		g.fillOval(545, 345, 150, 150);

	}

	public void displayName(Graphics g) {
		g.drawString(title, titleLocation.getX(), titleLocation.getY());
	}

	public void displayNumSides(Graphics g) {
		g.drawString(description, descriptionLocation.getX(),descriptionLocation.getY());
	}

}
