package helloworldapp;

import java.text.DecimalFormat;

public class TestParticle {

	public static void main(String[] args) {
		Particle particle = new Particle(1,1);
		particle.setMass(5);
		Particle particle2 = new Particle(2,2);
		double distance = particle.distanceOrigine();
		DecimalFormat decimal = new DecimalFormat("#.##");
		String distanceString= decimal.format(distance);
		String distanceDeuxPoints=decimal.format(particle.distanceDeuxPoints(particle2));
		System.out.println(distanceString);
		System.out.println(distanceDeuxPoints);
		float number = (float) 1.23;
		String numberAsString = String.format ("%.5f", number);
		System.out.format("%1.1f%n", number);  // -->  "3.142"
		System.out.println(numberAsString);
	}

}
