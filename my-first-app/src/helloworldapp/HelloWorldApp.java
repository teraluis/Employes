package helloworldapp;

/**
 * La classe HelloWorldApp implémente une application qui imprime simplement
 * "Hello World!" à la sortie standard.
 * 
 * @author slallier
 *
 */
public class HelloWorldApp {
	
	static String message="+Bonjour tout le monde!+";
	/**
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		
		int tailleMessage=message.length();
		System.out.print("\n");
		for(int i = 0;i<tailleMessage;i++) {
			System.out.print("*");
		}
		System.out.println("\n"+message); // Affiche la chaîne.
		for(int i = 0;i<tailleMessage;i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		HelloWorldApp2 hello = new HelloWorldApp2();
		System.out.println(hello.sayHello(0));
		System.out.println(hello.sayHello("HI M2I ",0));
		
		//Demo.monMethode();
		IODemo iodemo = new IODemo();
		iodemo.readString();

		
		
		
		
		
	}
	private String sayHello(String i) {
		return message+" "+i;
	}
}
