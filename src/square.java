import java.awt.*;

public class square implements Shape {

	public square(Graphics g) {

		drawShape(g);
		displayName(g);
		displayNumSides(g);

	}

	public void drawShape(Graphics g) {

		g.fillRect(155, 100, 100, 100);
	}

	public void displayName(Graphics g) {
		g.drawString("Square",25,25);

	}

	public void displayNumSides(Graphics g) {
		g.drawString("A square has 4 sides",140,226);

	}
}