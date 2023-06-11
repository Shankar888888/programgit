package create;

public class Constructor {

	Constructor()
	{
	 System.out.println("this is the default cunstructor");	
	}
	public Constructor(int obj)
	{
		System.out.println("this is single parameterised cunstructor");
	}
	public  Constructor(int i,int j)
		{
			System.out.println("this is two parameterised cunstructor"+i+j);
		}
	 
	 
	 void show()
	 {
		 System.out.println("this is the show method");
	 }
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Constructor obj= new Constructor();
        obj.show();
   
	}


} 