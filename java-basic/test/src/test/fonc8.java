package test;

import java.util.Scanner;

public class fonc8 {
static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int c=1,d=1,e=1;
		System.out.println("1er nomber = ");
		c = reader.nextInt();
		System.out.println("2eme nomber = ");
		d = reader.nextInt();
		System.out.println("3eme nomber = ");
		e = reader.nextInt();
		nember(c,d,e);

	}
	public static void nember(int a, int b,int c){
		System.out.println("la somme de ces nombres =" +a+b+c);
	}

}
