package create;

import java.util.Arrays;

public class LargestandSmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]= {10,8,1,9,4,2,5};
       int largest=num[0];
       int smallest=num[0];
       System.out.println(num.length);
       for(int i=0;i<num.length;i++)
       {
    	   if(num[i]>largest)
    	   {
    		   largest=num[i];
    	   }
    	   else if(num[i]<smallest)
    	   {
    		   smallest=num[i];
   
    	   }
    	  System.out.println(Arrays.toString(num));
    	   System.out.println("the largest number"+largest);
    	   System.out.println("the smallest number"+smallest);

    	   
       }

	}

}
