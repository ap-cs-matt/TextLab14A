import java.applet.Applet;
import java.awt.Graphics;
import java.util.*;

public class TextLab14A_Main extends Applet {

	public void paint(Graphics g) {
		drawGrid(g);
		Shape square = new square(g);
		Shape triangle = new triangle(g);
		Shape circle = new circle(g);
		Shape octagon = new octagon(g);
	
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(circle);
		shapes.add(octagon);
		
		for (Shape shape: shapes){
			shape.drawShape(g);
			shape.displayNumSides(g);
			shape.displayName(g);
		}
		
		
		
		
	}

	public void drawGrid(Graphics g) {
		g.drawRect(10, 10, 800, 600);
		g.drawLine(10, 300, 810, 300);
		g.drawLine(410, 10, 410, 610);
	}
	
	public void displayShape(Shape shape){
		
	}
}
