package dsa_college;

import java.util.Scanner;

public class Angle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two angle of a triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =180- (a+b);
		System.out.println(c);
		sc.close();
		

	}

}
