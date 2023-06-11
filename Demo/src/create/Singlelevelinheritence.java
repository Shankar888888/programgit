package create;

public class Singlelevelinheritence {
	void show()
	{
		System.out.println("this is the show method");
	}
     void display()
     {
    	 System.out.println("this is the display method ");
     }
     
     class CC extends Singlelevelinheritence
     {
    		void write()
    		{
    			System.out.println("this method is the child method having write");
    			
    		}
    		void stop()
    		{
    			System.out.println("this is the child method having stop ");
    		}
     }	

}


     
