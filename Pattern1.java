package dsa_college;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int row,col,n=4;
		Scanner sc = new Scanner(System.in);
		for(row=1;row<=n;row++) {
			for(col=1;col<=row;col++) {
				if(row<=4)
				System.out.print('A');
				else
					System.out.print("  ");
		}
			System.out.println();
		}
	}
}
		
	

		