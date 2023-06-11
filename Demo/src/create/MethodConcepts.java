package create;

public class MethodConcepts {
	//No returntype no input
	void show()
	{
		System.out.println("welcome to nucot");
	}
    
	
	 int add()
     {
    	 System.out.println("this  method is addition of two numbers ");
    	 int a=10,b=20,sum;
    	 sum=a+b;
    	 return sum;
     }
	 
	 String getCompanyName()
	 {
		 System.out.println("name of the company");
		 String name="microsoft";
		 return name;
	 }
	 
	 char getAlphabet()
	 {
		 System.out.println("name of the alphabet");
		 char c='A';
		 return c;
	 }
	 
	 int mul(int g,int l)
	 {
		 System.out.println("this the multiplication method");
		 
		 int mul=g*l;
		 return mul;
	 }
	 
       int getlength(String str)
	   {
		 System.out.println("the length of the String");
		 int Stringlength=str.length();
		 return Stringlength;
	 }
	 int sumArray(int array[])
	 {
		 int sum=0;
		 for(int arraynum:array)
		 {
			 sum=sum+arraynum;
			return sum;
		 }
		return sum;
		 
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodConcepts obj=new MethodConcepts();
		obj.show();
		int result=obj.add();
		System.out.println(result);
        System.out.println(obj.add());
        MethodConcepts obj1=new MethodConcepts();
        String S= obj1.getCompanyName();
        System.out.println(S);
        char cc=obj.getAlphabet();
        System.out.println(cc);
        MethodConcepts obj3=new MethodConcepts();
        int  l=2; 
        int  g=2;
		int mul=obj3.mul(g, l);
	    System.out.println(mul);
         int slength=obj.getlength("NUCOT");
        System.out.println(slength);
        MethodConcepts obj4=new MethodConcepts();
        int array[]= {1,2,3,4,5,6,7,8};
        int sumresults=obj4.sumArray(array);
        System.out.println(sumresults);
	
	
	
	}

}
