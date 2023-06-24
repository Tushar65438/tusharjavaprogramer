package dsa_college;

import java.util.Scanner;

public class Si {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle,time,rate");
		int p= sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int si=p*r*t/100;
		System.out.println(si);
		sc.close();
		

	}

}
