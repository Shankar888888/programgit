package exceptionconcept.com;

public class ExecutionOfExecution {
	
	public static int division(int i,int j)
	{
		int d=-1;
		try
		{
			d=i/j;
			Exceptiondemo ed=new Exceptiondemo();
			ed=null;
			ed.a=2;
			
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE");
			ae.printStackTrace();
		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int dd=ExecutionOfExecution.division(5,0);
     System.out.println(dd);
	}

}
