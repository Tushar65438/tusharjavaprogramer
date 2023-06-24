package dsa_college;

import java.util.Scanner;

public class Amitsir6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sides of triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a!=b) && (b!=c) && (c!=a))
			System.out.println("triangle is scalene");
		else if((a==b) && (b==c) && (c==a))
			System.out.println("triangle is equilateral");
		else if((a==b) || (b==a) || (c==a))
			System.out.println("triangle is isosceles");
		else 
			System.out.println("wrong");
		
	}
}
