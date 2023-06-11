package create;

import java.util.jar.JarEntry;

public class StringManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find  the length of the string we have method---- Length();
		//String s="welcome to selinium";
		//int len=s.length();
		//System.out.println(len);
		//charAt()
		//System.out.println(s.charAt(8));
		//indexof();
		//System.out.println(s.indexOf('e'));
          //if(s.indexOf("welcome to selinium")==1)
          //{
        	//  System.out.println("valid");
          //}  
        	//  else
        	  //{
        		//  System.out.println("invalid");
        	  //}
		//comparison--> == normal
		//String s1="Hello";
		//String s2="hello";
		//System.out.println(s1==s2);
		
		//comparing string with string object
		//String s3="Hello";
		//String s4=new String("Hello");
		//String s5="hello";
		//System.out.println(s3==s4);
		//System.out.println(s3.equals(s4));
		//System.out.println(s3.equals(s5));
		//System.out.println(s3.equalsIgnoreCase(s5));
		//String obj=new String("hello");
		//System.out.println(s3.equalsIgnoreCase(obj));
		
		//occur of char()
		String s6="welcome to selinium training in nucot";
		//System.out.println(s6.indexOf('e'));
		//System.out.println(s6.indexOf('e',13));//-1 odd code value
		//System.out.println(s6.indexOf('e',12));// odd code value
		
		//second occurance
		System.out.println(s6.indexOf('e',s6.indexOf('e')+1));
		System.out.println(s6.indexOf('o',s6.indexOf('e')+1));
		//System.out.println(s6.lastindexOf());
		System.out.println(s6.lastIndexOf('s',11));
		
		//SubString
		//String s7="welcome to selinium training in nucot";
		//System.out.println(s7.substring(11,19));
		
		//Replace
		//String s8="welcome to java";
		//System.out.println(s8.replace("",""));
		//String dateandtime="27/03/2023"; 
		//System.out.println(dateandtime.replace("/","-"));
		
		// trim
		//String s9="                hello world                       ";
		//System.out.println(s9.trim());	
		//System.out.println(s9);
		
        //split
		//String s10="welcome-to-selenium-training-in-nucot";
			//	String s111[]=s10.split("-");
		//for(int i=0;i<s111.length;i++)
		//{
			//System.out.println(s111[i]);
		//}
	}

}