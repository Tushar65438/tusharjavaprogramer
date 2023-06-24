package dsa_college;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of five subject");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int t = (a+b+c+d+e);
		System.out.println(t);
		int avg = (a+b+c+d+e)/5;
		System.out.println(avg);
		sc.close();
		

	

	}

}
