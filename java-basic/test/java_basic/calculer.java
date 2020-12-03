package java_basic;

import java.util.Scanner;

public class calculer {
	static Scanner prix = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		calc();
		
	}
	private static void calc() {
		System.out.println("entrer le prix : ");
		int total = prix.nextInt();	
		
		int prixLivres =3 * (total / 4);
		int prixCCB = total / 4;
		
		int cafe =10;
		int carts = 10;
		int billets = 8;
		
		int num = prixCCB / 3;
		
		int numCafe = num / cafe;
		int numCarts = num / carts;
		int numbillets = num / billets;
		
		int res = (num % cafe) + (num % carts) + (num % billets) + (prixCCB % 3);
		
		System.out.println("le prix des livers : " + prixLivres +"dh");
		System.out.println("le nomber des cafe : " + numCafe);
		System.out.println("le nomber des carts : " + numCarts);
		System.out.println("le nomber des billets : " + numbillets);
		System.out.println("le reste : " + res+"dh");
		
		
	}
	
	
	
	
	
	
}
