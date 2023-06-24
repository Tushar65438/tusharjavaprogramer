package dsa_college;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the marks");
		int a = sc.nextInt();
		if(a>=35 && a<=50) {
			System.out.println("pass with 3rd division");
		}
		else if(a>=50 && a<=60) {
			System.out.println("pass with 2nd division");}
		else if(a>=60 && a<=75) {
			System.out.println("pass with 1st division");}
		else if(a>=75 && a<=100){
			System.out.println("pass with distiction");}
		else
		{
			System.out.println("wrong");
		}
		
	}
}

	