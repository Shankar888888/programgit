package wrapperclasses.com;

public class Conceptonwrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //wrapper classes in java---->To wrapper primitive data types into objects    
	    //objects can be used in collections
	        
	        //1.Integer Wrapper class
	        
	        String s="11";
	        System.out.println(s);
	        System.out.println(s+10);
	        
	        //data conversion: String to int
	        int a=Integer.parseInt(s);
	        System.out.println(a+10);
	        
	        String ss="1";
	        int p=Integer.parseInt(ss);
	        System.out.println(p+2);
	        
	        //converting int to Integer
	        
	        int aa=10;
	        Integer num=Integer.valueOf(aa);
	        System.out.println(num);
	        
	        //converting Integer to int
	        
	        int intvalue=num.intValue();
	        System.out.println(intvalue);
	        
	        //Integer, Double,Boolean
	        
	        //String to Boolean
	        String b="true";
	        boolean bb=Boolean.parseBoolean(b);
	        System.out.println(bb);
	        
	        
	        //String to double
	        String sss="12.00";
	        System.out.println("Before conversion"+sss+10);
	        double dd=Double.parseDouble(sss);
	        System.out.println("After conversion value is "+dd+10);
	        
	        
	        //2.int to String
	    
	        int i=20;
	        System.out.println("Before conversion"+i+10);
	        String ii=String.valueOf(i);
	        System.out.println("After conversion value is "+ ii+10);
	        
	        //3.char to Character
	        char ch='A';
	        System.out.println("before conversion"+ch);
	        Character chh=Character.valueOf(ch);
	        System.out.println("after conversion"+chh);
	    
	        //Character to char
	        
	        
	        char chch=chh.charValue();
	        System.out.println(chch);
	        
	        	        
	    }
	
	}


