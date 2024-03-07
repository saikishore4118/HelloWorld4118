package com;

public class Verify {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="keep";
		String s2="peek";
		char[] ch1=s.toCharArray();
		char[]ch2 =s2.toCharArray();
		char[] temp= new char[ch1.length];
		for (int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
					temp[i]=ch2[j];
					
			}
		}
		
		for (char t:temp)
		System.out.println(t);
System.out.println("helloworld");
	}

}
