package dsa_college;

import java.util.Scanner;


public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		
		int l= sc.nextInt();
		int b= sc.nextInt();
		int hu= 2*(l+b);
		System.out.println(hu);
		sc.close();
	}
}

		
		
		