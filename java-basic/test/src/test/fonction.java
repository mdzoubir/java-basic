package test;

import java.util.Scanner;

public class fonction {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("entre string :");
		String	b =reader.nextLine();
		sayString(b);
	}

	//private static void sayTrue() {
	//	System.out.println("True");		
	//}
	private static void sayString(String a) {
		System.out.println("the string is :" + a);		
	}

}
