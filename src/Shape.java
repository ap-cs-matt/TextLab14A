import java.awt.Graphics;

public abstract interface Shape {

	public abstract void drawShape(Graphics g);

	public abstract void displayName(Graphics g, Point point);

	public abstract void displayNumSides(Graphics g);

}
