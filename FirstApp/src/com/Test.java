package com;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sachin";
		String s2=s1.toString();
		String s3=s1.toUpperCase();
		String s4=s1.toLowerCase();
		String s5=s1.toUpperCase();
		String s6=s1.toLowerCase();
		System.out.print(s1==s6);//true
		System.out.print(s3==s5);//false
		System.out.print(s1==s2);//true
		System.out.print(s1==s3);//true
		StringBuffer sb = new StringBuffer("a192123456789");
		System.out.println(sb.capacity());
	}

}
