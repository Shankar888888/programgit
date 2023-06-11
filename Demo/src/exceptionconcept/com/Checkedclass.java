package exceptionconcept.com;

public class Checkedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("welcome to nucot");
     try
     {
    	 Thread.sleep(1000);
    	 
     }
     catch(InterruptedException e)
     {
    	 e.printStackTrace();
     }
     System.out.println("thanks");
	}

}
