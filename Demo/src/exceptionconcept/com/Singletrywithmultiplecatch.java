package exceptionconcept.com;

public class Singletrywithmultiplecatch {
    int aa;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int j=11/0;
			Singletrywithmultiplecatch emwobj=new Singletrywithmultiplecatch();
			emwobj=null;
			emwobj.aa=5;
			//int j=11/0;
		}
		catch(ArithmeticException e1)
		//catch(ArithmeticException e1 | NullPointerException e2)
		{
			System.out.println("this is AE ");
			//e1.printStackTrace();
		}
		catch(NullPointerException e2)
		{
			System.out.println("this is Npe");
			e2.printStackTrace();
		}
		System.out.println("exceptions are handled");
		}
	}


