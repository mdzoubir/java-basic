package test;

import java.util.Scanner;

public class fonc7 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("votre genre :");
		String	c =reader.nextLine();
		
		System.out.println("votre age :");
		int	d =reader.nextInt();
		
		sayString(c, d);
	}
	private static void sayString(String a,int b) {
		if (a == "homme") {
			if (b>18) {
				System.out.println("•	Vous êtes un homme et vous êtes mineur");
			}else{
				System.out.println("•	Vous êtes un homme et vous êtes majeur");
			}
		}
		if (a == "femme"){
			if (b>18) {
				System.out.println("•	Vous êtes un femme et vous êtes mineur");
			}else{
				System.out.println("•	Vous êtes un femme et vous êtes majeur");
			}
		}
		else{
			System.out.println("no");
		}
	}

}
