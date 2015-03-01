import java.awt.*;

class triangle implements Shape {

	private String title;
	private Point titleLocation;

	private String description;
	private Point descriptionLocation;

	public triangle(Graphics g) {

		title = "Triangle";
		titleLocation = new Point(430, 25);

		description = "A triangle has 3 sides";
		descriptionLocation = new Point(555, 226);

	}

	public void drawShape(Graphics g) {
		Polygon t = new Polygon();
		t.addPoint(525, 200);
		t.addPoint(725, 200);
		t.addPoint(625, 100);
		g.fillPolygon(t);

	}

	public void displayName(Graphics g) {
		g.drawString(title, titleLocation.getX(), titleLocation.getY());
	}

	public void displayNumSides(Graphics g) {
		g.drawString(description, descriptionLocation.getX(),
				descriptionLocation.getY());
	}

}
