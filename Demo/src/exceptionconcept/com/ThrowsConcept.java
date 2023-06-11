package exceptionconcept.com;

/*public class ThrowsConcept {
	public void loginpage()
	{
		System.out.println("this is .loginpage");
		homepage();
	}
	public void homepage()
	{
		System.out.println("this is .loginpage");
		searchpage();
	}
	public void searchpage()
	{
		System.out.println("this is .loginpage");
		addtocart();
	}
	public void addtocart()
	{
		System.out.println("this is .loginpage");
		int a=10/0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThrowsConcept thobj=new  ThrowsConcept();
		 thobj.loginpage();
	}

}*/
  
public class ThrowsConcept {
    //throws keyword in java
    //throws key word is used to explicitly throw an exception
    
    public void loginPage()throws ArithmeticException
    {
        System.out.println("This is loginPage");
        homePage();
    }
    public void homePage()throws ArithmeticException
    {
        System.out.println("This is homePage");
        searchPage();
        
    }
    public void searchPage()throws ArithmeticException
    {
        System.out.println("This is searchPage");
        //addToCart();
        try
        {
        addToCart();
        }
        catch(ArithmeticException e)
        {
            System.out.println("AE");
        }
    }
    public void addToCart() throws ArithmeticException
    {
        System.out.println("This is addToCart");
        int a=10/0;
        
    }
    
    public static void main(String[] args)throws ArithmeticException {
        // TODO Auto-generated method stub
        
        ThrowsConcept thObj=new ThrowsConcept();
        //
        //try
        //{
        thObj.loginPage();
        //}
        //catch(ArithmeticException e)
        //{
            System.out.println("AE In Main method");
        //}
        
        
        
        
        System.out.println("Continue with module");
    
    }
}