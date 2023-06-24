package dsa_college;
import java.util.Scanner;


public class CI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float n = sc.nextFloat();
		float time =sc.nextFloat();
		double ci= p*((1+r)/n^(n*t));
		System.out.println(ci);
		sc.close();
	}
}

		
		
		
	