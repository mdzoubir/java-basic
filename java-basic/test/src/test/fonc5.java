package test;

import java.util.Scanner;

public class fonc5 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("your name :");
		String	c =reader.nextLine();
		System.out.println("your age :");
		int	d =reader.nextInt();
		sayString(c, d);
	}

	//private static void sayTrue() {
	//	System.out.println("True");		
	//}
	private static void sayString(String a,int b) {
		System.out.println("my name is :" +a+ " my age is :" +b);		
	}

}

