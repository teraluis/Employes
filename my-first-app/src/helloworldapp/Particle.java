package helloworldapp;

public class Particle extends Point{
	private double mass;
	
	public Particle(double x,double y,double mass) {
		super(x,y);
		this.setMass(mass);
	}
	public Particle(double x,double y) {
		super(x,y);
		this.mass=1;
	}
	public double getX() {
		return super.getX();
	}

	public void setX(double x) {
		super.setX(x);
	}

	public double getY() {
		return super.getX();
	}

	public void setY(double y) {
		super.setY(y);
	}

	public double getMass() {
		return this.mass;
	}

	public void setMass(double mass) {
		this.mass = mass*9.81;
	}

	public double distanceOrigine() {
		return Math.sqrt(Math.pow(this.getX(), 2)+Math.sqrt(this.getY()));
	}
	public double distanceDeuxPoints(Particle a) {
		return Math.sqrt(Math.pow((this.getX()- a.getX()),2)+Math.pow((this.getX()- a.getX()), 2));
	}
}
