package test;

import java.util.Scanner;

public class fonction3 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("entre string :");
		String	c =reader.nextLine();
		System.out.println("entre string :");
		String	d =reader.nextLine();
		sayString(c, d);
	}

	//private static void sayTrue() {
	//	System.out.println("True");		
	//}
	private static void sayString(String a,String b) {
		System.out.println("the string is : " + a + " " + b);		
	}

}
