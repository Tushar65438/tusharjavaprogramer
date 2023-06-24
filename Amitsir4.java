package dsa_college;

import java.util.Scanner;

public class Amitsir4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter a no");
		int n = sc.nextInt();
		if(n%4==0)
			System.out.println("  leap year");
		else if(n%100==0)
			System.out.println("not a leap year");
		else if(n%400==0)
			System.out.println("leap year");
		else
			System.out.println(" not leap year");
		
		
	}
}
		
	