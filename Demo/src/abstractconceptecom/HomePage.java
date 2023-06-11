package abstractconceptecom;

    public class HomePage extends LoginPage
    {
    //2
    public HomePage()
    {
        System.out.println("this is homepage default constructor");
    }
    //3
    @Override
    public void url() 
    {
        // TODO Auto-generated method stub
        System.out.println("The homepage UrL");
    }
//4
    @Override
    public void titleOfPage() 
    {
        // TODO Auto-generated method stub
        System.out.println("home page title");
        
    }
    
    public void productList()
    {
        System.out.println("This is product list in home page");
    }
    
    
}
