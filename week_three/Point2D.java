public class Point2D {

	private double x;
	private double y;

	public Point2D(double x, double y) {
		setX(x);
		setY(y);
	}

	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}

	public double getX() {return this.x;}
	public double getY() {return this.y;}

	public double[] getCoords() {
		double[] coords = {this.getX(), this.getY()};
		return coords;
	}
}