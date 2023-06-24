package dsa_college;
import java.util.*;
public class ProgramNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d;
		int r=0;
		int i;
	    System.out.println("Enter any number");
	    int n=sc.nextInt();
	    for(i=0;n!=0;i++)
	    {
	    	d=n%10;
	    	r=r*10+d;
	    	n=n/10;
	    }
	    System.out.println("The reverse of number is"+r);
	    sc.close();
	}

}
