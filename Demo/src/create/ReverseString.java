package create;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S=" nucot";
       String rev=" ";
       int length= S.length();
       System.out.println(length);
       for(int i=length-1;i>0;i--)
       {
    	   rev = rev+S.charAt(i);
    	   
       }
       System.out.println(rev);
    		   
	}

}
