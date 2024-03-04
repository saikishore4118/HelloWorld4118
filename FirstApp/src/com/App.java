package com;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String s1 ="sachin";
		 String s2 = "sachin";
		 System.out.println(s1==s2); //false
		 System.out.println(s1.equals(s2));//true

		 String s3=new String("dhoni");
		 String s4=new String("dhoni");
		 System.out.println(s3==s4); //false
		 System.out.println(s3.equals(s4));//true
		 StringBuilder sb1 = new StringBuilder("sachin");
		 StringBuilder sb2 = new StringBuilder("sachin");
		 System.out.println(sb1==sb2); //false
		 System.out.println(sb1.equals(sb2));//false
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter user name");
		 String userName = sc.next();
		 
		 System.out.println("enter password");
		 String password = sc.next();
		 StringBuilder sb = new StringBuilder();
		for (int i=0;i<password.length();i++)
			sb.append("*");
		 System.out.println("username : "+userName);
		 System.out.println("password : "+sb);

	}

}
