package dsa_college;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		int r = sc.nextInt();
		int d = 2*r;
		System.out.println(d);
		double c = 2*3.14*r;
		System.out.println(c);
		double a = 3.14*Math.pow(r, 2);
		System.out.println(a);
		sc.close();
		

	}

}
