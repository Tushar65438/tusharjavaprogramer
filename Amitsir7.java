package dsa_college;

import java.util.Scanner;

public class Amitsir7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hra,da;
		System.out.println("enter basic salary");
		int n = sc.nextInt();
		if(n<=10000)
		{
			hra=n*(20/100);
			da=n*(80/100);
			System.out.println(hra);
			System.out.println(da);
		}
		else if(n<=20000)
		{
			hra =(n)*(25/100);
			da =(n)*(90/100);
			System.out.println(hra);
			System.out.println(da);
		}
		else if(n>20000) {
			hra = (n)*(30/100);
			da = (n)*(95/100);
			System.out.println(hra);
			System.out.println(da);
		}
		sc.close();
	}
	
}
		
		
		

	