package create;

public class EmployeeOverriding {
	void salary()
	{
		int wages=10;
		int days=30;
		int basic=wages*days;
		double hra=basic*0.2;
		double da=basic*0.010;
		double pf=basic*0.2;
		double netsalary=basic+hra+da+pf;
		System.out.println("method in employeeoverridingconcept"+netsalary);
	}	
		class  Manager extends EmployeeOverriding
		{
			void salary()
			{
				int wages=20;
				int days=30;
				int basic=wages*days;
				double hra=basic*0.2;
				double da=basic*0.010;
				double pf=basic*0.2;
				double netsalary=basic+hra+da+pf;
				System.out.println("method in manager"+netsalary);
				
		    }
		
				
	   }
        class HR extends Manager
        {
        	void salary()
        	{
        		int wages=30;
        		int days=30;
        		int basic=wages*days;
        		double hra=basic*0.2;
        		double da=basic*0.010;
        		double pf=basic*0.2;
        		double netsalary=basic+hra+da+pf;
        		System.out.println("method in HR"+netsalary);
        	}
        }
}
