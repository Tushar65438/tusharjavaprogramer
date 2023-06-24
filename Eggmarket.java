package dsa_college;

import java.util.Scanner;

public class Eggmarket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Welcome to egg market");
			System.out.println("Enter the number of egg");
			int n = sc.nextInt();
			double d = (n/12); 
			System.out.println("the dorzen is"+ d);
			double ex=(n%12);
			System.out.println("the extra is"+ ex);
			
			if(d>=2 && d<=5) {
				
			
			int tp = n*6;
			double dis = tp*0.02;
			double t = tp-dis;
			System.out.println(t);
			}
			else if(d>=5&& d<=10) {
				
			
			int tp = n*6;
			double dis = tp*0.05;
			double t = tp-dis;
			System.out.println(t);
			}
			else if(d>=10 && d<=12) {
				
				
				int tp = n*6;
				double dis = tp*0.12;
				double t = tp-dis;
				System.out.println(t);
			}
		}
}
			
			
			
		
		
		
		
