import java.awt.*;

public class square implements Shape {

	private String title;
	private Point titleLocation;
	
	public square(Graphics g) {

		title = "Square";
		titleLocation = new Point (25,25);
		
		
		drawShape(g);
		displayName(g, new Point(25,25));
		displayNumSides(g);

	}

	public void drawShape(Graphics g) {

		g.fillRect(155, 100, 100, 100);
	}

	public void displayName(Graphics g) {
		g.drawString(title,titleLocation.getX(),titleLocation.getY());

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A square has 4 sides",140,226);

	}
}