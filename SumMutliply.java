package dsa_college;
import java.util.*;
public class SumMutliply {
	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int s=0;
    int p=1;
    int r;
    System.out.println("Enter any number");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	r=n%10;
    	s=s+r;
    	p=p*r;
    	n=n/10;
    }
    System.out.println("The sum of number is"+s);
    System.out.println("The product of number is "+p);
    
   sc.close();
}
}