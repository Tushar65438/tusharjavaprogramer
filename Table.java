package dsa_college;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter any number");
		int n=sc.nextInt();
		for(i=0;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		sc.close();

	}

}
