package create;

public class Constructorconcepts2 {

	String name;
	int age;
	double salary;
	public Constructorconcepts2()
	{
		System.out.println("this is default constructor");
	}
	//static void show() 
	//{  //local variable
		//int i=10;
		//System.out.println(i);
	//}
	static void show()
	{
		System.out.println("this is static method");
	}
	public Constructorconcepts2(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(this.name+" "+this.age+" "+this.salary);
	} 
	public Constructorconcepts2(String name,int age,double salary,String companyname)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		String a=companyname;
		System.out.println(this.name+" "+this.age+" "+this.salary+" "+a);
	} 
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorconcepts2 obj1=new Constructorconcepts2();
		Constructorconcepts2 obj2=new Constructorconcepts2("nucot",10,2000.00);
		Constructorconcepts2 obj3=new Constructorconcepts2("nucot",10,2000.00,"HCL");
	    //System.out.println(com);
		show();
		Constructorconcepts2.show();	
	
	}

}
