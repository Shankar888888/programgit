package staticconcepts;

public class Staticblockconcepts {
	  static int i=10;//static variable
	    int j=10;//normalor gobal or instance variable
	    
	    //3.
	    private Staticblockconcepts()//constructor
	    {
	        System.out.println("This is constructor ");
	    }
	    
	    public static void read()
	    {
	        System.out.println("this is static method");
	    }
	    
	    //4-->Normal method
	    void display()
	    {
	        System.out.println("This is display method");
	        System.out.println(i);
	        System.out.println(j);
	    }
	    //static block--->1--->static block--->special block in java
	    static ///when class is loaded into the JVM the static block will be executed
	    {
	        
	        System.out.println("Oder is one");
	       // System.out.println(j);
	        System.out.println(i);//1
	        System.out.println("This is Nucot");//2
	        read();//this is called making call to the static method//13
	        main(10);//48
	    }
	    
	    
	    //any number of static blocks can contain in side the class
	    
	    static
	    {
	        System.out.println("Oder is Two");
	        
	    }
	    static
	    {
	        System.out.println("Oder is Three");
	    }
	    static
	    {
	        System.out.println("Oder is four");
	    }
	    static
	    {
	        System.out.println("Oder is five");
	    }
	    
	    
	    //2.//entry point public static void main(String[] args)
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Staticblockconcepts staticObj=new Staticblockconcepts();
	        staticObj.display();
	        Staticblockconcepts.read();
	        
	        
	        
	
	    }
	    public static void main(int args) {
	        // TODO Auto-generated method stub
	        Staticblockconcepts staticObj=new Staticblockconcepts();
	        staticObj.display();
	        Staticblockconcepts.read();
	        
	        
	        

	    }
	}