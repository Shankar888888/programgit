package exceptionconcept.com;

public class Throwconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String userDetails=null;
		if(userDetails==null)
		{
			//throw new Exception("donot found exception");
           try
			{
        	   throw new Exception("donot found exception");

			}
			catch(Exception e)
			{
				//e.printStackTrace();
			} 
			 System.out.println(userDetails.length());
		}
		 try
		 {
			 System.out.println(userDetails.length());
		 }
		 catch(NullPointerException e)
		 {
			System.out.println("not able to get lenghth"); 
			//e.printStackTrace();
			
		 }
		/*try
		{
			throw new Exception("pageTimeout");
		}
		catch(Exception e)
		{
		 System.out.println("customised exception");
		 e.printStackTrace();
		}*/
		
		
		
		
		
		
		
	}

}
