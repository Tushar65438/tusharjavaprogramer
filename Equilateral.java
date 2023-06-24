package dsa_college;

import java.util.Scanner;

public class Equilateral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter area");
		int a = sc .nextInt();
		double b= (Math.sqrt(3))/4*Math.pow(a, 2);
		System.out.println(b);
		sc.close();
		
		
		

	}

}
