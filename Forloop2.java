package dsa_college;

import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "*"+i+"=" +(n*i));
		}
		
	}
}

