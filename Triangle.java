package dsa_college;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base and height of a trinagle");
		int b = sc.nextInt();
		int h = sc.nextInt();
		double tg = ((0.5)*b*h);
		System.out.println(tg);
		sc.close();
		
	}

}
