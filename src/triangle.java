import java.awt.*;

class triangle implements Shape {

	
	public triangle(Graphics g){
		
		drawShape(g);
		displayName(g);
		displayNumSides(g);
		
	}
	
	public void drawShape(Graphics g) {
		Polygon t = new Polygon();
		t.addPoint(525, 200);
		t.addPoint(725,200);
		t.addPoint(625,100);
		g.fillPolygon(t);

	}

	public void displayName(Graphics g) {
		g.drawString("Triangle",430,25);

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A triangle has 3 sides",555,226);

	}

}
