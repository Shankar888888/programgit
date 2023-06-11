package create;

public class Polymorphism {
	void area() 
	{
		System.out.println("this is the area of circle");
		
	}
	void area(int a,String name,int c,int d)
	{
		System.out.println("this is the area of keyboard");
		
	}
	void area(String name,int a)
	{
		System.out.println("this is the aea of laptop");
		
	}
	void area(int a,int b)
	{
		System.out.println("this the area of india");
		
	}
	void area(int a,int b,int c)
	{
		System.out.println("this the area of world");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Polymorphism obj11=new Polymorphism();
		obj11.area(10,20);
		obj11.area("MAC",10);
		obj11.area(10,20,30);
		obj11.area();
	}

}
