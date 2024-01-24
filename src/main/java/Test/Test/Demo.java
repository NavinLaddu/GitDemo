package Test.Test;

import java.util.Arrays;

public class Demo {
	
	
	    public static void main(String[]args)
	    {
	        String x= "ARADHYA";
	        String y= "HRADAYA";
	        char a[]=x.toCharArray();
	       char b[]= y.toCharArray();
	       Arrays.sort(a);
	       Arrays.sort(b);
	       boolean result=Arrays.equals(a,b);
	       if(result==true)
	       {
	           System.out.println("it is an anagram");
	       }
	       else {
	       System.out.println("it is not an anagram");
	       }
	    }
	}