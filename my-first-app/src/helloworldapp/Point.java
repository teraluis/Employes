package helloworldapp;

public class Point {
	private double x;
	private double y;
	
	public Point(double x2,double y2) {
		this.setX(x2);
		this.setY(y2);
	}
	public void modifier(double x,double y) {
		this.setX(x);
		this.setY(y);
	}
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	public void print() {
		System.out.println("x : "+x+"y : "+y);
	}
}
