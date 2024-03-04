package com;
class encap{
	int age;
	public void getage()
	{
		System.out.println(age);
	}
}
public class Snippet {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub

	
		// TODO Auto-generated method stub

	
	boolean hyder=false;
			String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
			
			s1=s1.replace(" ", "");
			
			char[] ch=s1.toCharArray();
			
			int[] ar=new int[26];
			
			for(int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
			
			System.out.println("=========");
			for(int i=0; i<ar.length;i++)
			{
				ar[i]=i;
			}
			
	}
}

