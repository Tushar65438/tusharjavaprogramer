package dsa_college;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char ch='a';
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(col>=n-row+1 && col<=n)
					System.out.print(ch);
				else
					System.out.print(" ");
			}
			System.out.println();
			ch++;
		}
	}
}
		
	

	


