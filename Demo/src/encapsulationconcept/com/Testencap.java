package encapsulationconcept.com;

public class Testencap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentencap objstud=new Studentencap();
		objstud.setName("Nucot");
		String s1=objstud.getname();
		System.out.println(s1);
		objstud.setAge(10);
		int s2=objstud.getAge();
		System.out.println(s2);
		objstud.setAccno(12345);
		int s3=objstud.getAccno();
		System.out.println(s3);
		objstud.setAtmpin(1111);
		int s4=objstud.getAtmpin();
		System.out.println(s4);
		//Studentencap objstud1=new Studentencap("nucot",20,12345,"banglore","xyz");
		//System.out.println(objstud1.comany);
	}

}
