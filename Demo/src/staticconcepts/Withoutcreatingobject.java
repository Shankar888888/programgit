package staticconcepts;

public class Withoutcreatingobject {
	 private Withoutcreatingobject()
	    {
	        System.out.println("This is constructor");
	        
	    }
	    
	     public void show()
	    {
	        System.out.println("This is normal method");
	        
	    }
	    
	    public static void show2()
	    {
	        System.out.println("This is static method Withoutcreatingobject");
	        
	        
	    }
	    
	    static 
	    {
	        System.out.println("This is static block");
	        show2();
	        
	    }
	    
	}


