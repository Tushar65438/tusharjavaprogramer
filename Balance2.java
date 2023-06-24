package dsa_college;

import java.util.Scanner;

public class Balance2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if (a<10)
			System.out.println("checking account balance is low");
		else if (a<100)
			System.out.println("saving account balance is low");
		else
			System.out.println("wrong entry");
		sc.close();
		
		

	}

}
