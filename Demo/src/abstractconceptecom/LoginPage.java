package abstractconceptecom;

public abstract class LoginPage {
	public LoginPage()
    {
        System.out.println("Abstract class constructor");
    }
    
    //non implemented methods
    public abstract void url();
    public abstract void titleOfPage();
    //5
    //implemented
    public final void loginLogo()
    {
        System.out.println("Company Logo");
    }
    //6
    //pageloading or webelements loading in the page
    public void pageLoding()
    {
        System.out.println("Taking 5 seconds to display");
    }
    //7
    //static method
    public static void colour()
    {
        System.out.println("Should be red colour");
        
    }

}
