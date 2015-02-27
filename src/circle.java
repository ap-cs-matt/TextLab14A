import java.awt.Graphics;
import java.awt.Polygon;

public class circle implements Shape {

public circle(Graphics g){
		
		drawShape(g);
		displayName(g, new Point(430,320));
		displayNumSides(g);
		
	}
	
	public void drawShape(Graphics g) {
		g.fillOval(545,345,150,150);

	}

	public void displayName(Graphics g, Point point) {
		g.drawString("Circle",point.getX(),point.getY());

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A circle has 0 sides",555,521);

	}

}
