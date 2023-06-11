package create;

public class Employeedata {
	String name;
	int empid;
    float salary;
    String designation;
    String dept;
    String companyname;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeedata emp1=new Employeedata();
		emp1.name="prakash";
		emp1.empid=10;
		emp1.salary=1010.0f;
		emp1.designation="QA";
		emp1.dept="IT";
		emp1.companyname="microsoft";
		System.out.println(emp1.name+" "+emp1.empid+" "+emp1.salary+" "+emp1.designation+" "+emp1.dept+" "+emp1.companyname);
	  
		Employeedata emp2=new Employeedata();
		emp2.name="prak";
		emp2.empid=112;
		emp2.salary=111110.0f;
		emp2.designation="devoleper";
		emp2.dept="IT and Sales";
		emp2.companyname="microsoft";
		System.out.println(emp2.name+" "+emp2.empid+" "+emp2.salary+" "+emp2.designation+" "+emp2.dept+" "+emp2.companyname);
	
	
	}

}
