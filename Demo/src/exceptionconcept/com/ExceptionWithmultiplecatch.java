package exceptionconcept.com;

public class ExceptionWithmultiplecatch {
	
	int aa;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try
		{
			int i=10/0;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("this is AE ");
			ae.printStackTrace();
		}
		ExceptionWithmultiplecatch emwobj=new ExceptionWithmultiplecatch();
		emwobj=null;
		try
		{
			emwobj.aa=5;
		}
		catch(NullPointerException npe)
		{
			System.out.println("this is Npe");
			npe.printStackTrace();
		}
		
	}

}
