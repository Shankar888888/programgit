package create;

public class Browser {
	
	boolean launchBrowser(String browsername)
	{
		boolean flag;
		boolean(flag==true)
	    switch(browsername)
		{
		case:"chrome";
              System.out.println("please launch chrome browser");
               break;
		case:"firefox";
              System.out.println("please launch firefox browser");
              break;
		case:"ie";
               System.out.println("please launch ie browser");
               break;

		case:"mozilla";
              System.out.println("please launch mozilla browser");
              break;
	     default:
           System.out.println("please launch correct browser");
           break;    
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj=new Browser();
		boolean bn=obj.launchBrowser("chrome");
		
		
		
	}
}

