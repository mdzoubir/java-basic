package test;

import java.util.Scanner;

public class fonc6 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("your first name :");
		String	c =reader.nextLine();
		System.out.println("your last name :");
		String	d =reader.nextLine();
		System.out.println("your age :");
		int	e =reader.nextInt();
		sayString(c, d, e);
	}

	//private static void sayTrue() {
	//	System.out.println("True");		
	//}
	private static void sayString(String a,String b,int c) {
		System.out.println("my first name is "+a+ " my last name is "+b+ " my age is :" +c);		
	}

}
