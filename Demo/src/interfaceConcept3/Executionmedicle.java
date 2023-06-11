package interfaceConcept3;

public class Executionmedicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//1.way
			Hospital hp=new Hospital();
			hp.bloodBank();
			hp.dentalService();
			hp.labServices();
			hp.orthoServices();
			hp.pediaServices();
			hp.physioServices();
			hp.generalService();
			hp.scanningCenter();
			//hp.emergencyServices();
		
			
			//accessing static variable present in Bmedical
			//System.out.println(Bmedical.a);
			
			//2.Top casting
			//Amedical am=new Hospital();
			//am.generalService();
			//am.scanningCenter();
			//am.dentalService();
			
			
			//Bmedical bm=new Hospital();
			//bm.labServices();
			
			//
			
			
			
			

		

	

	}

}
