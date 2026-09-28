package String;

import java.util.Arrays;

public class Inbuiltmethods {
	public static void main(String[] args)
	{
		String s="java programming";
		String s1="programming";
		
		//length()
		  System.out.println(s1.length());
		
		//charAt(int)
		  System.out.println(s.charAt(0));
		
		//Equals(object o)
		  System.out.println(s.equals(s1));
		
		//EqualsIgnorecase(String)
		  System.out.println(s.equalsIgnoreCase(s1));
		
		//CompareTo(String)
		  System.out.println(s.compareTo(s1));
     		if(s.compareTo(s1)==0)
			   System.out.println("same String...");
		    else if(s.compareTo(s1)<=0)
			   System.out.println(s+"came first");
		    else
		       System.out.println(s1+"came first");
     		
		//Contains(String)
		  System.out.println(s.contains(s1));
		
		//indexOf(String)
		  System.out.println(s.indexOf(s1));
		
		//lastIndexof(String)
	      System.out.println(s.lastIndexOf(s1));
		
		//ToUppercase()
		  System.out.println(s.toUpperCase());
	
		//ToLowercase()
		  System.out.println(s.toLowerCase());
		
		//Trim()
		  System.out.println(s.trim());
		
		//Replace(char,char)
		  System.out.println(s.replace('j','m'));
		
		//ReplaceAll(String,String)
		  System.out.println(s.replaceAll("g","G"));
		
		//substring(int)
		 System.out.println(s.substring(13));
		
		 //substring(int,int)
		 System.out.println(s.substring(11, 13));
		
		    //Split(String)
		    String[] str=s.split(" ");
     		System.out.println(Arrays.toString(str));
		
		    //tocharArray()
		    char[] c=s.toCharArray();
		    System.out.println(Arrays.toString(c));
		
	      //isEmpty()
		  System.out.println(s1.isEmpty());
		
    	//concat(String)
		System.out.println(s1.concat(s));
	}
}
