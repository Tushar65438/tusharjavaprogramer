package dsa_college;

import java.util.Scanner;

public class Amitsir1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter a no");
		int n = sc.nextInt();
		if(n>0)
		 System.out.println("positive");
		else if (n<0)
			System.out.println("negative");
		else 
			System.out.println("zero");
	}
}
		