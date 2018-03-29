package helloworldapp;

public class HelloWorldApp2 {
	
	private String message="Bonjour";
	private int index = 0;
	public String sayHello(int i) {
		return message+i;
	}
	public String sayHello(String message,int i) {
		return message+i;
	}
	
}
