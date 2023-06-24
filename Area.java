package dsa_college;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		int l = sc.nextInt();
		int b =sc.nextInt();
		int a =l*b;
		System.out.println(a);
		sc.close();
	}
}
	