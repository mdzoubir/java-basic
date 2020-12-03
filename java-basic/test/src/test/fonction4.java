package test;

import java.util.Scanner;

public class fonction4 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("entrer le 1ere nomber : ");
		int c = reader.nextInt();
		System.out.println("entrer le 2em nomber : ");
		int d = reader.nextInt();
		nember(c,d);
	}
	public static void nember(int a,int b){
		if ( a < b) {
			System.out.println("•	le premier nombre : " + a + " est plus petit que le deuxième nombre : " + b);
		}if (a==b){
			System.out.println("•	Les deux nombres sont identiques ");
		}else{
			System.out.println("•	le premier nombre : " + a + " est plus grand que le deuxième nombre : " + b);
		}
	}

}
