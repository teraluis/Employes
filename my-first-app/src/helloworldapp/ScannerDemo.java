package helloworldapp;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String [] args) {
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enrer une chaine :");
		str = in.next(); //lecture d'une String
		System.out.println("C'est quand même plus simple ..."+str);
		in.close();
	}
}
