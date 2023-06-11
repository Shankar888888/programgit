package create;

public class StaticConcepts {
	String name,color,brand;
	int price,seatcapacity;
	static int wheels;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticConcepts obj=new StaticConcepts();
		obj.name="SUV";
		obj.color="red";
		obj.brand="honda";
		obj.price=10000;
		obj.seatcapacity=4;
		StaticConcepts.wheels=4;
	System.out.println(obj.name+" "+obj.color+" "+obj.brand+" "+obj.price+" "+obj.seatcapacity+" "+StaticConcepts.wheels);	
		
	StaticConcepts obj1=new StaticConcepts();
	obj1.name="TRON";
	obj1.color="blue";
	obj1.brand="audi";
	obj1.price=1000000;
	obj1.seatcapacity=6;
	StaticConcepts.wheels=4;
System.out.println(obj1.name+" "+obj1.color+" "+obj1.brand+" "+obj1.price+" "+obj1.seatcapacity+" "+StaticConcepts.wheels);	
    
System.out.println("**************************************");
obj=obj1;

System.out.println(obj.name+" "+obj.color+" "+obj.brand+" "+obj.price+" "+obj.seatcapacity+" "+StaticConcepts.wheels);	
System.out.println(obj1.name+" "+obj1.color+" "+obj1.brand+" "+obj1.price+" "+obj1.seatcapacity+" "+StaticConcepts.wheels);	



	}

}
