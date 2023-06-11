package create;

public class Java_Demo {

	public static void main(String[] args) {
		//System.out.println("this is my first java program");
	    //primitive datatypes
		//size --- > 1byte ---> 8 bits
		//range --- > -128 to +127 bits
		
	byte a=10;
	     a=20;
	     a=30; 
	     System.out.println(a);
	     
	     byte b=10;
	     System.out.println(" the value of B  " +(b+a)); 
	     
	  // 2.short
	     //primitive datatypes
			//size --- > 2byte ---> 16 bits
			//range --- > -32768 to +32767 bits
	         short s=10;
	         System.out.println(+s);
	     
	     
	     // 3.int 
	     //primitive datatypes
			//size --- > 4byte ---> 32 bits
			//range --- > -2147483648 to +2147483647  bits
			int i=2346;
			System.out.println(i);
			
			// 4. long
		     //primitive datatypes
				//size --- > 8byte ---> 64 bits
		         long l=1111;
		         System.out.println(l);
			
		      // 5. float
			     //primitive datatypes
					//size --- > 4byte ---> 32 bits
		         //range --> up to 7 digits 
		         float f1=12.00f;
			         float f2=(float)12.00;
			         System.out.println(f1);
			         System.out.println(f2);
			         
			      // 6. double
				     //primitive datatypes
						//size --- > 8byte ---> 64 bits
			         //range --> up to 16 digits 
			         
			         double d1=17.00;
			         double d2=(double)17.00;
			         System.out.println(d1);
			         System.out.println(d2);
			         
				//6  char -- Anything which is enclosed within single qoute 
			         // size -- 2 bytes -- 16 bits
			         char c='a';
			         char c2='3';
			       // char c3='shankar';
			         System.out.println(c);
			         System.out.println(c2);
			       // System.out.println(c3);
			    
			         
			         //Boolean  means  that true or flase
			         //size -- 1 bit
			         boolean fl= true;
			         boolean f5= false;
			         System.out.println(fl);
			         System.out.println(f5);
	}
}