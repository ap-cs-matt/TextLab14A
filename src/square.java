import java.awt.*;

public class square implements Shape {

	private String title;
	private Point titleLocation;

	private String description;
	private Point descriptionLocation;

	public square(Graphics g) {

		title = "Square";
		titleLocation = new Point(25, 25);

		description = "A square has 4 sides";
		descriptionLocation = new Point(140, 226);
	}

	public void drawShape(Graphics g) {
		g.fillRect(155, 100, 100, 100);
	}

	public void displayName(Graphics g) {
		g.drawString(title, titleLocation.getX(), titleLocation.getY());
	}

	public void displayNumSides(Graphics g) {
		g.drawString(description, descriptionLocation.getX(),
				descriptionLocation.getY());
	}
}