package dsa_college;

import java.util.Scanner;

public class Crc1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element of array5");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value is");
        System.out.println(max);
   
	}

}
