package dsa_college;

import java.util.Scanner;

public class Switchcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		System.out.println("enter + for addition,- for subtraction,* for multiplation,/ for division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ch = sc.next();
		int rev;
		switch(ch)
		{
		case "+": rev=a+b;
				System.out.println(rev);
		break;
		case "-": rev=a-b;
				System.out.println(rev);
		
		break;
		case "/": rev=a/b;
				System.out.println(rev);
		break;
		case "*": rev=a*b;
				System.out.println(rev);
		break;
		case "%": rev=a%b;
		System.out.println(rev);
		break;
		default:
			System.out.println("wrong choice");
			
		
		}
		
		

	}

}
