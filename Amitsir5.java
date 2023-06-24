package dsa_college;

import java.util.Scanner;

public class Amitsir5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the angle of triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b>c)
			System.out.println("triangle is valid");
		else if(b+c>a)
			System.out.println("valid");
		else if(c+a>b)
			System.out.println("valid");
		else
			System.out.println("not valid");
		

	}

}
