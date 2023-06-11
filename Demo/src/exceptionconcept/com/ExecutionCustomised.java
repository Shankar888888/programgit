package exceptionconcept.com;

public class ExecutionCustomised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String browser="ie";
		 if(browser.equals("chrome"))
		 {
			 System.out.println("please launch chrome browser");
		 }
		 else if(browser.equals("firefox"))
		 {
			 System.out.println("please launch firefox browser");
		 }
		 else if(browser.equals("ie"))
		 {
			 System.out.println("please launch ie browser");
		 }
		 else
		 {
			// System.out.println("pass correct browser name");
			throw new CustomisedException("Browser not found");
		 }
		 
	}

}
