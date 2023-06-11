package exceptionconcept.com;

public class Exceptiondemo {

	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("welcome to nucot");
     System.out.println("welcome to nucot");
     System.out.println("welcome to nucot");
     System.out.println("welcome to nucot");
     
     
    	 Exceptiondemo ed=new Exceptiondemo();
    	 ed=null;
    	 try
    	 {
    		 ed.a=3;
    		 
    	 }
    	 catch(NullPointerException np)
    	 {
    		 np.printStackTrace();
    	 }
     try
     {
    	 System.out.println("modi");
    	 int a=10/0;
    	 System.out.println("amit");
    	 System.out.println("amit");
    	 System.out.println("amit");
     }
     //catch(ArithmeticException e)
      catch(Exception e)
     {
    	 //System.out.println(" handle arithmetic exception");
    	 e.printStackTrace();
     }
     
     System.out.println("thanks");
     System.out.println("Hi");
	
	
	}

}
