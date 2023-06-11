package interfaceConcept3;

public class Hospital implements Amedicle,Bmedicle 
{

	@Override
	public void generalService() {
		// TODO Auto-generated method stub
		System.out.println("this is general services");
		
	}

	@Override
	public void dentalService() {
		// TODO Auto-generated method stub
		System.out.println("this is dental services");
	}

	@Override
	public void scanningCenter() {
		// TODO Auto-generated method stub
		System.out.println("this is scanning centers");
	}

	@Override
	public void labServices() {
		// TODO Auto-generated method stub
		System.out.println("this is lab services");
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("this is physio services");
	}

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		System.out.println("this is pedia services");
	}

	@Override
	public void bloodBank() {
		// TODO Auto-generated method stub
		System.out.println("this is blood bank services");
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("this is ortho services");
	}


	}
  

