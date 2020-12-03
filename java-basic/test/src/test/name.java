package test;

import java.util.Scanner;

public class name {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] arge){
		String name;
		System.out.println("Quel est votre prénom ?");
		name = reader.nextLine();
		System.out.println("Bonjour " + name);
	}
}