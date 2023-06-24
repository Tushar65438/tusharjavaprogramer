package dsa_college;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d;
		double s=0;
		int n = 0;
		
		System.out.println("enter a no");
		  int n1 = sc.nextInt();
		  int t=n1;
		while(n1!=0)
		{
			d=n1%10;
			s=s+Math.pow(d,3);
			n1=n1/10;
		}
		if(s==t)
		{
	   System.out.println("Armstrong no.");
		}
	   else
	   {
		   System.out.println("not armstrong");
	   }
	
	}
}