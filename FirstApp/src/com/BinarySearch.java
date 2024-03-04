package com;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
	public int add(int a, int b) {
        int result = a + b;
        return result;
    }
public static void main(String[] args) {

    // create a 3d array
	
int[] ar = {10,20,30,40};
Scanner scan = new Scanner(System.in);
System.out.println("enter the key to b searched ");
   int key =   scan.nextInt();
   int low =0;
   int high = ar.length-1;
   while(low<=high)
   {
	   int mid =(low+high)/2;
	   if(key==ar[mid])
	   {
		   System.out.println("key found at index "+mid);
		   break;
	   }
	   else if(key <ar[mid])
	   {
		   high = mid-1;
		   
	   }
	   else if(key >ar[mid])
	   {
		   low = mid+1;
		   
	   }
   }
   if(low>high)
	   System.out.println("key not found");
   

}
}
