import java.awt.Graphics;
import java.awt.Polygon;

public class circle implements Shape {

public circle(Graphics g){
		
		drawShape(g);
		displayName(g);
		displayNumSides(g);
		
	}
	
	public void drawShape(Graphics g) {
		g.fillOval(545,345,150,150);

	}

	public void displayName(Graphics g) {
		g.drawString("Circle",430,320);

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A circle has 0 sides",555,521);

	}

}
