package dsa_college;
import java.util.*;
public class Pattern012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int j;
		int n=5;
		for(i=1;i<=n;i++)
		{
		 for(j=n;j>i;j--)
		 {
		   System.out.println(" ");
		 }
		  for(j=1;j<=i;j++)
		  {
			 System.out.print("*" );
		  }
		  System.out.println();
		  sc.close();
		}

	}

}
