package abstractconceptecom;

public class TestingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HomePage hp=new HomePage();
	        hp.url();
	        hp.titleOfPage();
	        hp.loginLogo();
	        hp.pageLoding();
	        LoginPage.colour();
	        hp.productList();
	        System.out.println("********************************");
	        //By taking -->child class object can be reffered by the parent (abstract)
	        //class ref variable
	        //Top casting
	        LoginPage lp=new HomePage();
	         lp.url();
	         lp.titleOfPage();
	         lp.loginLogo();
	         lp.pageLoding();
	         LoginPage.colour();
	         
	         
	         
	    }

	}


