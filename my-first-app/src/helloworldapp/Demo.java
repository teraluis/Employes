package helloworldapp;

import java.io.IOException;

public class Demo {

	public static void monMethode() {
		char car =' ';
		System.out.println("Entrer un caract");
		try {
			car = (char) System.in.read();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("car ="+car);
		

	}

}
