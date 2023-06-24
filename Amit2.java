package dsa_college;

import java.util.Scanner;

public class Amit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		if(n%5==0)
			System.out.println("divisible by 5");
		else if(n%11==0)
			System.out.println("divisible by 11");
		else
			System.out.println("not");
	}
}

		
			
		