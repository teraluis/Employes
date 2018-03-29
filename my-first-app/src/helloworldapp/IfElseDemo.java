package helloworldapp;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		int number;
		Integer number1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enrer un entier:");
		try {
		number = in.nextInt();
		number1 = in.nextInt();
		if(number<number1) {
			System.out.println(number+"<"+number1);
		}else if(number==number1) {
			System.out.println(number+"="+number1);
		}else {
			System.out.println(number+">"+number1);
		}
		}catch(InputMismatchException e) {
			System.out.println("Veuillez rentrer des nombres correcttes");

		}
//		String monchiffre="010";
//		System.out.println(Integer.parseInt(monchiffre));
		in.close();

	}
	public static void comparer(int number,int number1) {
		if(number<number1) {
			System.out.println(number+"<"+number1);
		}else if(number==number1) {
			System.out.println(number+"="+number1);
		}else {
			System.out.println(number+">"+number1);
		}
	}

}
