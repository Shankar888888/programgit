package create;

public class Methodoverriding {
	void display()
	{
		System.out.println("this is the parent overriding concept");
	}

}
 class DD extends Methodoverriding
 {
	 
	 void display()
	 {
		 System.out.println("this is the child overriding concept"); 
	 }
 }