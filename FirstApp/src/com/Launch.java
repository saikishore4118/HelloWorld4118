package com;
import java.util.*;

public class Launch {

	public static void main(String[] args) {

		String s = "sachin";
		String s1 = "sachin";

		String s2 = new String ("sachin");
		String s3 = new String ("sachin");

        System.out.println(s==s1  );
        System.out.println( s.equals(s1) );

        System.out.println("*******************************" );

        System.out.println(s2==s3  );
        System.out.println( s2.equals(s3) );
        
        System.out.println("*************StringBuilder******************" );

        
        StringBuilder sbld1 = new StringBuilder("Hello");
        StringBuilder sbld2 = new StringBuilder("Hello");
        System.out.println(sbld1==sbld2  );
        System.out.println( sbld1.equals(sbld2) );
	}
	
public static boolean equals(StringBuilder sb1, StringBuilder sb2){
        
        /*
         * If both refer to the same object, they are equal
         */
        if(sb1 == sb2)
            return true;
 
        /*
         * If any of them is null, then they are not equal.
         * We know both are not null at this point because of the previous
         * condition which checks equality.
         */
        if(sb1 == null || sb2 == null)
            return false;
        
        boolean isEqual = true;
        
        /*
         * If both are not same length, they are not equal
         */
        if(sb1.length() == sb2.length()){
            
            /*
             * Now, compare the characters one by one, and break the loop
             * as soon as the characters at given position are different.
             */
            for(int i = 0 ; i < sb1.length(); i++){
                
                if(sb1.charAt(i) != sb2.charAt(i)){
                    isEqual = false;
                    break;
                }
            }
            
        }else{
            isEqual = false;
        }
        
        return isEqual;
    }

}
