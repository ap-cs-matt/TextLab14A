import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Antialiasing
{

	public static void applyAntialiasing(Graphics g)
	{
		Graphics2D g2=(Graphics2D)g;
		
		RenderingHints rh= new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setRenderingHints(rh);
	}
}
