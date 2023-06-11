package create;

public class ClassesObjectsConcepts {
	String name;
	String address;
	int age;
	int ssn;
	int mobilenumber;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesObjectsConcepts obj1=new ClassesObjectsConcepts();
		System.out.println(obj1.name); 
		obj1.name="ganesh";
		obj1.address="bangalore";
		obj1.age=21;
		obj1.ssn=10;
		obj1.mobilenumber=222;
		//System.out.println(obj1.name);
		//System.out.println(obj1.address);
		//System.out.println(obj1.age);
		//System.out.println(obj1.ssn);
		//System.out.println(obj1.mobilenumber);
		System.out.println(obj1.name+" "+obj1.address+" "+obj1.age+" "+obj1.ssn+" "+obj1.mobilenumber);
	   
		
		ClassesObjectsConcepts obj2=new ClassesObjectsConcepts();
		String name,address;
		int age,ssn,mobilenumber;
		obj2.name="gan";
		obj2.address="bang";
		obj2.age=24;
		obj2.ssn=105;
		obj2.mobilenumber=555;
		System.out.println(obj2.name+" "+obj2.address+" "+obj2.age+" "+obj2.ssn+" "+obj2.mobilenumber);
	}

}
