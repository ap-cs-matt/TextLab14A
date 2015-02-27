public class ShapeData {

	private int sides;

	private String shapeName;

	public ShapeData(String shapeName, int sides, int titleX, int titleY,
			int messageX, int messageY) {
		this.shapeName = shapeName;
		this.sides = sides;

		Point titleLocation = new Point(titleX, titleY);
		Point messageLocation = new Point(messageX, messageY);
	}

	public String getShapeName() {
		return shapeName;

	}

	public int getSide() {
		return sides;

	}

	public Point getPoint(Point point){
		return point;
	}
}
