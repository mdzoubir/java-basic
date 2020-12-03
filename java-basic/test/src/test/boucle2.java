package test;

import java.util.Scanner;

public class boucle2 {
	static Scanner khadija = new Scanner(System.in);
	public static void main(String[] args) {
		int d;
		System.out.println("choisirie un nomber entre 2 et 100 :");
		d = khadija.nextInt();
		for (int i=1; i<30; i++) {
			int c = i*d;
			System.out.println("miltiple de i x b = " + c);
			System.out.println("+i : " + (c+i));
			
		}
		
		
	}
}
